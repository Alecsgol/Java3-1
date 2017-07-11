package ru.geekbrains.java3.dz.dz1.morozalexander.no_1_2;

import java.util.ArrayList;

/**
 * Created by СПБ on 10.05.2017.
 * @author Alexander Moroz
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("New array:");
        Mas<?> m = new Mas<>(new Cat(), new Dog());
        m.info();

        System.out.println("\nExchange array items:");
        m.masElementsExchange();
        m.info();

        System.out.println("\nArrayList:");
        ArrayList<?> list = m.arrayToArrayList();
        for (Object o : list) System.out.println(o.getClass().getName());
    }
}