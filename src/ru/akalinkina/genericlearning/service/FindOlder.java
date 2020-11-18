package ru.akalinkina.genericlearning.service;

import ru.akalinkina.genericlearning.model.FullPerson;

import java.time.LocalDate;

public class FindOlder extends Finder<FullPerson, LocalDate> {

    @Override
    protected LocalDate getValue(FullPerson fullPerson) {
        return fullPerson.getDateOfBirth();
    }

    @Override
    protected boolean isHeavier(LocalDate v1, LocalDate v2) {
        return v1.compareTo(v2) < 0;
    }

    @Override
    protected FullPerson getPerson(FullPerson element) {
        return element;
    }
}
