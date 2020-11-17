package com.company.utiles;

import com.company.geometria.ComparatorPorCoordenadaX;
import com.company.geometria.ComparatorPorCoordenadaY;
import com.company.geometria.Punto;

import java.util.List;

public class Puntos {

    public static void ordenadaPorCoordenadaX(List<Punto> puntos){
        puntos.sort(new ComparatorPorCoordenadaX());
    }

    public static void ordenadaPorCoordenadaY(List<Punto> puntos){
        puntos.sort(new ComparatorPorCoordenadaY());
    }

}
