package ru.levelup.lessoin2.homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n = scan.nextInt();
        int res = n % 2;
        if (res == 0) {
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели нечетное число");
        }
    }
}
