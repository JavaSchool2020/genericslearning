package ru.javaschool.genericlearning.model;

public class Single<T> {

    private T value;

    public Single(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
