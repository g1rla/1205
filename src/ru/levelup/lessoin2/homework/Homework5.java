package ru.levelup.lessoin2.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Привет Нелли");
        Random r = new Random();
        int secretNumber = r.nextInt(151) + 5;
        if (secretNumber > 25 & secretNumber < 100) {
            System.out.println("Число " + secretNumber + " содержится в интервале (25;100)");
        } else {
            System.out.println("Число " + secretNumber + " не содержится в интервале (25;100)");
        }

    }
}
