package ru.levelup.lessoin2.homework;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        float num1 = scan.nextFloat();
        System.out.println("Введите второе число");
        float num2 = scan.nextFloat();
        float res1 = num1 - 10;
        float res2 = 10 - num2;
        if (num1 < 10 & num2 < 10 & num2 > num1) {
            System.out.println("Ближайшее к 10 число:" +  num2);
        } else if (num1 < 10 & num2 < 10 & num2 < num1) {
            System.out.println("Ближайшее к 10 число:" + num1);
        } else if (num1 > 10 & num2 > 10 & num1 < num2) {
            System.out.println("Ближайшее к 10 число:" + num1);
        } else if (num1 > 10 & num2 > 10 & num1 > num2) {
            System.out.println("Ближайшее к 10 число:" + num2);
        } else if (num1 > 10 & num2 < 10 & res1 < res2) {
            System.out.println("Ближайшее к 10 число:" + num1);
        } else {
            System.out.println("Ближайшее к 10 число: " + num2);
        }
    }
}
