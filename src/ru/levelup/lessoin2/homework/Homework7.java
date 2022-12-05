package ru.levelup.lessoin2.homework;

public class Homework7 {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int c = -1;
        // abc
        // acb
        //bac
        //bca
        //cab
        //cba
        if (a < b && a < c && b < c) {
            System.out.println("Возрастающая последовательность: " + a + " "+ b + " " + c);
        } else if (a < b && a < c && b > c) {
            System.out.println("Возрастающая последовательность: " + a + " " + c + " " + b);
        } else if (b < a && b < c && a > c) {
            System.out.println("Возрастающая последовательность: " + b + " " + c + " " + a);
        } else if (b < a && b < c && a < c) {
            System.out.println("Возрастающая последовательность: " + b + " " + a + " " + c);
        } else if (c < a && c < b && b > a) {
            System.out.println("Возрастающая последовательность: " + c + " " + a + " " + b);
        } else
            System.out.println("Возрастающая последовательность: " + c + " " + b + " " + a);
    }
}
