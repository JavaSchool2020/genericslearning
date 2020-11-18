package ru.akalinkina.genericlearning;

import java.util.ArrayList;
import java.util.List;

public class GenericStyle {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("mum");

        //ошибка компиляции
        //strList.add(1);
        strList.add("dad");

        //ошибка компиляции
        String element = strList.get(0);

        System.out.println(element);

    }
}
