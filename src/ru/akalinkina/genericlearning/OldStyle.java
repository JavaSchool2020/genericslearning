package ru.akalinkina.genericlearning;

import java.util.ArrayList;
import java.util.List;

public class OldStyle {
    public static void main(String[] args) {
        List strList = new ArrayList();
        strList.add("mum");

        //ошибка компиляции
        strList.add(1);

        //ошибка компиляции
        Integer element = (Integer) strList.get(0);

        System.out.println(element);
    }
}
