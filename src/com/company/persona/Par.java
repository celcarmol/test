package com.company.persona;

public class Par<T> {
    private T up;
    private T down;

    public Par(T up, T down) {
        this.up = up;
        this.down = down;
    }

    public T getUp() {
        return up;
    }

    public T getDown() {
        return down;
    }

    @Override
    public String toString() {
        return "Par{" +
                "up=" + up +
                ", down=" + down +
                '}';
    }
}
