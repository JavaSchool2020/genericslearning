package ru.javaschool.genericlearning;

import ru.javaschool.genericlearning.model.*;
import ru.javaschool.genericlearning.service.FindOlder;
import ru.javaschool.genericlearning.service.Finder;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class UsingExploring {
    public static void main(String[] args) {
        FullPerson fullPerson = new FullPerson();
        fullPerson.setName("Antonina");
        fullPerson.setDateOfBirth(LocalDate.now());

        FullishPerson fullishPerson = new FullishPerson();
        fullishPerson.setDateOfBirth(LocalDate.of(1980, 1, 2));
        fullishPerson.setName("Vasya");

        new UsingExploring().print(new FindOlder(), Arrays.asList(fullPerson, fullishPerson));

        //Bill bill = new Bill(LocalDate.now(), fullPerson, new Sum(new BigDecimal("100"), new BigDecimal("2")));
        //Bill bill2 = new Bill(LocalDate.now(), fullishPerson, new Sum(new BigDecimal("102"), new BigDecimal("2")));

        //new UsingExploring().print(new FindMaxBill(), Arrays.asList(bill, bill2));
    }

    public <V, K> void print(Finder<V, K> finder, List<V> list) {
        System.out.println(finder.find(list));
    }

}
