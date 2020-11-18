package ru.javaschool.genericlearning.model;

public class FullishPerson extends FullPerson {
    private String locale;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public String toString() {
        return "FullishPerson{" +
                "locale='" + locale + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
