package com.company;

import java.time.LocalDateTime;

public interface Vuelo extends Comparable<Vuelo>{
    String getCodigo();
    void setCodigo(String codigo);
    String getAerolinea();
    void setAerolinea(String aerolinea);
    LocalDateTime getFechaSalida();
    void setFechaSalida(LocalDateTime fechaSalida);
}
