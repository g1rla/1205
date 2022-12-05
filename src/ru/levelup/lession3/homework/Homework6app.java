package ru.levelup.lession3.homework;

import java.util.Random;

public class Homework6app {
    public static void main(String[] args) {
        Random r = new Random();
        Homework6 h = new Homework6();
        h.x = 5;
        h.y = 155;
        int secretNumber = r.nextInt(h.x, h.y);
        if (secretNumber > 25 & secretNumber < 100) {
            System.out.println("Число " + secretNumber + " содержится в интервале (25;100)");
        } else {
            System.out.println("Число " + secretNumber + " не содержится в интервале (25;100)");
        }
    }

}
