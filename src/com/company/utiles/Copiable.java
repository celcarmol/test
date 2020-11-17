package com.company.utiles;

public interface Copiable<T> extends Cloneable {
    T clone();
}
