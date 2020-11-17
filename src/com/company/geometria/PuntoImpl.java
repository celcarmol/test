package com.company.geometria;

public class PuntoImpl implements Punto {

    private Double coordenadaX;
    private Double coordenadaY;

    public PuntoImpl(Double coordenadaX, Double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    @Override
    public Double getCoordenadaX() {
        return this.coordenadaX;
    }

    @Override
    public void setCoordenadaX(Double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    @Override
    public Double getCoordenadaY() {
        return coordenadaY;
    }

    @Override
    public void setCoordenadaY(Double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public Punto resta(Punto p) {
        return new PuntoImpl(p.getCoordenadaX() - this.coordenadaX, p.getCoordenadaY() - this.coordenadaY);
    }

    public String isGreaterThanZero() {
        if (this.coordenadaX > 0 && this.coordenadaY > 0) {
            return "Es mayor que cero";
        } else {
            return "Es MENOR que cero";
        }
    }

    @Override
    public String toString() {
        return "(" + coordenadaX +"," + coordenadaY + ')';
    }

    @Override
    public int compareTo(Punto o) {
        int cmp = this.getCoordenadaY().compareTo(o.getCoordenadaY());
        if (cmp == 0) {
            cmp = this.getCoordenadaX().compareTo(o.getCoordenadaX());
        }
        return cmp;
    }
}
