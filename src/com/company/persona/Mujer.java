package com.company.persona;

public class Mujer extends Persona{
    private boolean tieneRegla;

    public Mujer(String nombre, String dni, boolean tieneRegla) {
        super(nombre, dni);

        this.tieneRegla = tieneRegla;
    }

    public boolean isTieneRegla() {
        return tieneRegla;
    }

    public void setTieneRegla(boolean tieneRegla) {
        this.tieneRegla = tieneRegla;
    }

    @Override
    public String toString() {
        return "Mujer{ tieneRegla=" + tieneRegla + '}';
    }
}
