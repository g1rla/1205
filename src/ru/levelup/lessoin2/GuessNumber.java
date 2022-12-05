package ru.levelup.lessoin2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt(); // считает значение введенное с клавиатуры, преобразует его в инт и сохранит переменную
        // Генерация числа (использую ГПСЧ)
        Random r = new Random();
        // генерирует число от 0 до числа, указанного в скобках, исключая его (число - 1)
        int secretNumber = r.nextInt(4); // [0, 4)
        // r.nextInt(3) + 1 - [0, 3) + 1 - [1, 4)
        if (secretNumber == enteredNumber) {
            System.out.println("Вы угадали");

        } else {
            if (secretNumber > enteredNumber) {
                System.out.println("Вы ввели число меньше, которое было сгенерировано");
            } else {
                System.out.println("Вы ввели число больше, которое было сгенерировано");
            }
            System.out.println("Вы неправильно ввели. Секретное число" + secretNumber);
        }

    }
}
