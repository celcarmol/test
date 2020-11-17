package com.company.aeropuertos;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class VueloImpl implements Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;
    private Integer numeroPlazas;
    private Integer numeroPasajeros;

    public VueloImpl(String codigo, String origen, String destino, LocalDateTime fechaSalida,
                     LocalDateTime fechaLlegada, Integer numeroPlazas, Integer numeroPasajeros) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.numeroPlazas = numeroPlazas;
        this.numeroPasajeros = numeroPasajeros;
    }

    public VueloImpl(String codigo, String origen, String destino, LocalDateTime fechaSalida,
                     LocalDateTime fechaLlegada, Integer numeroPlazas) {
        this(codigo, origen, destino, fechaSalida, fechaLlegada, numeroPlazas, 0);
    }

    public VueloImpl(String codigo) {
        this(codigo, "Sevilla", "Madrid",
                LocalDateTime.of(2020, 9, 4, 12, 20),
                LocalDateTime.of(2020, 2, 8, 5, 59),
                250);
    }

    private Boolean restriccionFechaSalidaPosteriorAFechaLlegada() {
        Boolean res;
        res = fechaSalida.isBefore(fechaLlegada);
        return res;
    }

    private Boolean restriccionNumeroPasajeros() {
        Boolean res;
        res = numeroPasajeros <= numeroPlazas;
        return res;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(Integer numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Integer getNumeroPlazas() {
        return numeroPlazas;
    }

    public Duration getDuracion() {
        return Duration.ofMinutes(getFechaSalida().until(getFechaLlegada(), ChronoUnit.MINUTES));
    }

    public Boolean estaCompleto() {
        return getNumeroPlazas().equals(getNumeroPasajeros());
    }

    public String toString() {
        return "(" + getCodigo() + ") " + getOrigen() + " - " + getDestino() + " " + getFechaSalida().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    public boolean equals(Object o) {
        boolean res = false;
        if (o instanceof Vuelo) {
            boolean aux1 = this.getCodigo().equals(((Vuelo) o).getCodigo());
            boolean aux2 = this.getOrigen().equals(((Vuelo) o).getOrigen());
            boolean aux3 = this.getDestino().equals(((Vuelo) o).getDestino());
            boolean aux4 = this.getFechaSalida().equals(((Vuelo) o).getFechaSalida());
            res = aux1 && aux2 && aux3 && aux4;
        }
        return res;
    }

    public int hashCode() {
        return this.getCodigo().hashCode() + this.getOrigen().hashCode() * 31 + this.getDestino().hashCode() * 31 * 31 + this.getFechaSalida().hashCode() * 31 * 31 * 31;
    }

    public int compareTo(Vuelo v) {
        int res = this.getCodigo().compareTo(v.getCodigo());
        if (res == 0) {
            res = this.getOrigen().compareTo(v.getOrigen());
            if (res == 0) {
                res = this.getDestino().compareTo(v.getDestino());
                if (res == 0) {
                    res = this.getFechaSalida().compareTo(v.getFechaSalida());
                }
            }
        }
        return res;
    }
}
