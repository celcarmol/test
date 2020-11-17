package com.company.geometria;

import java.util.Comparator;

public class ComparatorPorCoordenadaY implements Comparator<Punto> {
    @Override
    public int compare(Punto o1, Punto o2) {
        int cmp = o1.getCoordenadaY().compareTo(o2.getCoordenadaY());
        if (cmp == 0) {
            cmp = o1.getCoordenadaX().compareTo(o2.getCoordenadaX());
        }
        return cmp;
    }
}
