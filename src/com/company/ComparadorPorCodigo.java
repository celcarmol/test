package com.company;

import java.util.Comparator;

public class ComparadorPorCodigo implements Comparator<Vuelo> {

    @Override
    public int compare(Vuelo v1, Vuelo v2) {
        int res = v1.getCodigo().compareTo(v2.getCodigo());
        return res;
    }
}
