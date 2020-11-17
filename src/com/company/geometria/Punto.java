package com.company.geometria;

public interface Punto extends Comparable<Punto>{

    Double getCoordenadaX();
    void setCoordenadaX(Double coordenadaX);
    Double getCoordenadaY();
    void setCoordenadaY(Double coordenadaY);
    Punto resta(Punto p);
    String isGreaterThanZero();

}
