package ru.javaschool.genericlearning;

import ru.javaschool.genericlearning.model.Pair;
import ru.javaschool.genericlearning.model.Single;

import java.math.BigDecimal;

public class GenericExploring {
    public static void main(String[] args) {
        /////
        Single<String> simple = new Single<>("value");
        String value = simple.getValue();
        System.out.println(simple);

        /////
        Pair<String, Integer> pair = new Pair<>("mum", 100);
        String key = pair.getKey();
        Integer value2 = pair.getValue();


        Pair<Double, BigDecimal> pair1 = new Pair<>(1d, new BigDecimal("0"));

        Single<Integer> intSimple = new Single<>(1);
        new GenericExploring().printValue(intSimple);

        System.out.println(new GenericExploring().getValue(intSimple));
    }

    public <T> void printValue(Single<T> simple) {
        System.out.println(simple.getValue());
    }

    public <T> T getValue(Single<T> simple) {
        return simple.getValue();
    }
}
