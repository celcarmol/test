package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Vuelo v2 = new VueloImpl("VY7860", "Vueling", LocalDateTime.of(2020, 11, 14, 15, 0));
        Vuelo v1 = new VueloImpl("VY7861", "Vueling", LocalDateTime.of(2020, 11, 15, 20, 0));
        Vuelo v3 = new VueloImpl("RY7654", "Ryanair", LocalDateTime.of(2020, 11, 14, 15, 0));
        Vuelo v4 = new VueloImpl("RY7657", "Ryanair", LocalDateTime.of(2020, 11, 14, 15, 0));

        List<Vuelo> flightList = Arrays.asList(v1, v2, v3);
        mostrar(flightList);
        flightList.sort(new ComparadorPorCodigo());
        mostrar(flightList);
    }

    public static void mostrar(Object o) {
        System.out.println(o);
    }
}
