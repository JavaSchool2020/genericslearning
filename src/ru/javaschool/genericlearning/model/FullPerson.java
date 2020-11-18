package ru.javaschool.genericlearning.model;

import ru.javaschool.common.model.Person;

import java.time.LocalDate;

public class FullPerson extends Person {
    protected LocalDate dateOfBirth;

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "FullPerson{" +
                "dateOfBirth=" + dateOfBirth +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
