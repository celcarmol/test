package com.company;

import com.company.persona.Hombre;
import com.company.persona.Persona;

import java.util.List;

public class Utiles {

    public static boolean esMayorQueCinco(int param) {
        return param > 5;
    }

    public static <T> T last(List<T> lista) {
        return lista.get(lista.size() - 1);
    }

    public static String biggerThan(List<Hombre> peopleList) {
        int edad = 0;
        String nombre = "";

        for (Hombre h1 : peopleList) {
            if (h1.getEdad() > edad) {
                edad = h1.getEdad();
                nombre = h1.getNombre();
            }
        }

        return nombre;
    }

}
