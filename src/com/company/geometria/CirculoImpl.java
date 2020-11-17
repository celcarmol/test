package com.company.geometria;

public class CirculoImpl implements Circulo {

    private Double radio;
    private Double area;
    private Punto centro;
    private Double longitud;

    public CirculoImpl(Double radio, Double area, Punto centro, Double longitud) {
        this.radio = radio;
        this.area = area;
        this.centro = centro;
        this.longitud = longitud;

    }

    @Override
    public Double getRadio() {
        return radio;
    }

    @Override
    public void setRadio(Double x) {
        this.radio = radio;
    }

    @Override
    public Double getArea() {
        return area;
    }

    @Override
    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public Punto getCentro() {
        return centro;
    }

    @Override
    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    @Override
    public Double getLongitud() {
        return longitud;
    }

    @Override
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }



    @Override
    public String toString() {
        return "CirculoImpl{" +
                "radio=" + radio +
                ", area=" + area +
                ", centro=" + centro +
                ", longitud=" + longitud +
                '}';
    }
}
