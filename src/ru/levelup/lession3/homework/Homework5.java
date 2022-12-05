package ru.levelup.lession3.homework;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int enteredNumber = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= enteredNumber; i++) {
            factorial = factorial * i;
        }
            System.out.println("Factorial " + factorial);

    }
}