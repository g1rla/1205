package ru.levelup.lession9;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        //список на основе массива (аналог ListArray из предыдущий занятий)
        List<String> products = new ArrayList<>();

        products.add("Mikk");
        products.add("Cheese");
        products.add("Tomatoes");
        products.add("Cucumber");
        products.add("Bread");
        products.add("Milk");

        //products - содержит 6 элементов
        System.out.println("Size " + products.size());
        System.out.println("Has milk: " + products.contains("Milk"));
        System.out.println("Has chocolate: " + products.contains("chocolate"));

        //indexOf - exists only in list
        // передаем значениеб методи ищет значение внутри списка
        // и возвращается индекс первого встретивщегося элемента
        // если объекта нет в спикаб то вернется -1
        System.out.println("index of tomatoes: " + products.indexOf("Tomatoes"));
        System.out.println("index of milk: " + products.indexOf("Milk"));
        System.out.println("last index of milk: " + products.lastIndexOf("Milk"));

        products.remove("Milk");

        System.out.println();
        System.out.println("Product list:");
        //for-each - сокращенный for
        // for (<Type of collection's element> <var> : <collection's object>)
        for (String element : products) {
            // 1 iteration: element = Milk
            // 2 iteration: element = Cheese
            //....
            // 6 iteration: element = Milk
            System.out.println(element);
        }
        //wrapper-classes - классы обертки
        //double - Double
        double doubleValue = 423.25; // само значение
        Double objectDoubleValue = 4563.322; // ссылка
        //long - Long
        // int - Integer
        //char - Character
        //boxing/unboxing
        //boxing - from primitive to wrapper-class
        // int -> Integer
        Integer i1 = 4; // autoboxing -> Integer i1 = Integer.valueOf(4);
        //unboxing - from wrapper-class to primitive
        // Integer -> int
        int i2 = i1;

        Collection<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(5);
        integers.add(6);
        System.out.println();
        for (Integer val : integers) {
            System.out.println(val);
        }
    }
}
