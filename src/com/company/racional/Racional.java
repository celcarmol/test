package com.company.racional;

import com.company.utiles.Copiable;

public interface Racional extends Comparable<Racional>, Copiable<Racional> {
    Integer getNumerador();

    Integer getDenominador();

    Double getValorReal();

    void setNumerador(Integer a);

    void setDenominador(Integer a);

    void suma(Racional r);

    void resta(Racional r);

    void multiplica(Racional r);

    void divide(Racional r);

    void invierte();
}
