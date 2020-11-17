package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VueloImpl implements Vuelo{
    private String codigo;
    private String aerolinea;
    private LocalDateTime fechaSalida;

    public VueloImpl(String codigo, String aerolinea, LocalDateTime fechaSalida) {
        this.codigo = codigo;
        this.aerolinea = aerolinea;
        this.fechaSalida = fechaSalida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return codigo +
                " - " + aerolinea +
                " - " + fechaSalida.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    @Override
    public int compareTo(Vuelo v) {
        int result;
        result = this.getFechaSalida().compareTo(v.getFechaSalida());
        if (result ==0){
            result = this.getAerolinea().compareTo(v.getAerolinea());
            if (result == 0){
                result = this.getCodigo().compareTo(v.getCodigo());
            }
        }
        return  result;
    }
}
