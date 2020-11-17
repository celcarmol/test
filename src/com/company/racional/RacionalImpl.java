package com.company.racional;

import com.company.utiles.Enteros;

public class RacionalImpl implements Racional {

    private Integer numerador;
    private Integer denominador;

    public RacionalImpl() {
        numerador = 1;
        denominador = 1;
    }

    public RacionalImpl(Integer a) {
        if (a == null) {
            throw new IllegalArgumentException("Parametro null");
        }
        numerador = a;
        denominador = 1;
    }

    public RacionalImpl(Integer a, Integer b) {
        if (a == null || b == null || b == 0) {
            throw new IllegalArgumentException("Parametros null o El Divisor no puede ser cero");
        }
        if (b < 0) {
            numerador = -a;
            denominador = -b;

        } else {
            numerador = a;
            denominador = b;
        }
    }

    public Integer getNumerador() {
        return numerador;
    }

    public Integer getDenominador() {
        return denominador;
    }

    public Double getValorReal() {
        return (getNumerador()).doubleValue() / getDenominador();
    }

    public void setNumerador(Integer a) {
        numerador = a;
    }

    public void setDenominador(Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("El Divisor no puede ser cero");
        }
        denominador = b;
    }

    public void suma(Racional r) {
        Integer a = numerador * r.getDenominador() + denominador * r.getNumerador();
        Integer b = denominador * r.getDenominador();
        numerador = a;
        denominador = b;
    }

    public void resta(Racional r) {
        Integer a = numerador * r.getDenominador() - denominador * r.getNumerador();
        Integer b = denominador * r.getDenominador();
        numerador = a;
        denominador = b;
    }

    public void multiplica(Racional r) {
        Integer a = numerador * r.getNumerador();
        Integer b = denominador * r.getDenominador();
        numerador = a;
        denominador = b;
    }

    public void divide(Racional r) {
        if (r.getNumerador() == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        Integer a = numerador * r.getDenominador();
        Integer b = denominador * r.getNumerador();
        numerador = a;
        denominador = b;
    }

    public void invierte() {
        if (numerador == 0) {
            throw new ArithmeticException("No se puede invertir si el numerador es cero");
        }

        Integer a = numerador;
        Integer b = denominador;
        numerador = b;
        denominador = a;

    }

    public Racional clone() {
        Racional copia = null;
        try {
            copia = (Racional) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copia;
    }

    public String toString() {
        String s = getNumerador().toString();

        if (!getDenominador().equals(1)) {
            s = s + "/" + getDenominador();
        }

        return s;
    }

    public boolean equals(Object r) {
        boolean res = false;
        if (r instanceof Racional) {
            Racional r1 = (Racional) r;
            Integer prod1 = getNumerador() * r1.getDenominador();
            Integer prod2 = getDenominador() * r1.getNumerador();
            res = prod1.equals(prod2);
        }
        return res;
    }

    public int hashCode() {
        Integer n = getNumerador();
        Integer d = getDenominador();
        n = n / Enteros.mcd(n, d);
        d = d / Enteros.mcd(n, d);
        return n.hashCode() * 31 + d.hashCode();
    }

    public int compareTo(Racional r) {
        Integer prod1 = getNumerador() * r.getDenominador();
        Integer prod2 = getDenominador() * r.getNumerador();
        return prod1.compareTo(prod2);
    }

}
