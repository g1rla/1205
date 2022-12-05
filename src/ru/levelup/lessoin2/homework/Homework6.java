package ru.levelup.lessoin2.homework;

import java.util.Random;

public class Homework6 {
    public static void main(String[] args) {
        Random r = new Random();
        int secretNumber = 100 + r.nextInt(999 - 100);
        System.out.println(secretNumber);
        int sym1 = secretNumber / 100;
        int x = secretNumber / 10;
        int sym2 = x % 10;
        int sym3 = secretNumber % 10;
        if (sym1 > sym2 & sym1 > sym3) {
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + sym1);
        } else if (sym2 > sym1 & sym2 > sym3) {
            System.out.println("В числе " + secretNumber + " наибольшая цифра " + sym2);
        } else {
            System.out.println(sym3);
        }
    }
}
