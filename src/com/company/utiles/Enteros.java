package com.company.utiles;

public class Enteros {

    public static Integer mcd(Integer m, Integer n) {
        m = Math.abs(m);
        n = Math.abs(n);
        Integer dividendo = m, divisor = n, resto;
        resto = dividendo % divisor;
        while (resto != 0) {
            dividendo = divisor;
            divisor = resto;
            resto = dividendo % divisor;
        }
        return divisor;
    }

}
