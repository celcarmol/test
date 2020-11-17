package com.company.persona;

public class Hombre extends Persona {

    private boolean esFuerte;
    private boolean esGuapo;

    private boolean tieneBarba;
    private int edad;

    public Hombre(String nombre, String dni, boolean esFuerte,
                  boolean esGuapo, int edad) {
        super(nombre, dni);

        this.tieneBarba = true;
        this.esFuerte = esFuerte;
        this.esGuapo = esGuapo;
        this.edad = edad;
    }

    public Par<Boolean> esFuerteYGuapo() {
        return new Par<>(this.esFuerte, this.esGuapo);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTieneBarba() {
        return tieneBarba;
    }

    public void setTieneBarba(boolean tieneBarba) {
        this.tieneBarba = tieneBarba;
    }

    @Override
    public String toString() {
        return "Hombre{ tieneBarba=" + this.tieneBarba + " , " + super.toString() + '}';
    }
}
