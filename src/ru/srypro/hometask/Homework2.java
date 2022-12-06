package ru.srypro.hometask;

public class Homework2 {
    public static void main(String[] args) {
        // первое задание
        int clientOS = 1;
        if (clientOS < 1) {
            System.out.println("Установить версию приложения для IOS по ссылке");
        } else
            System.out.println("Установить версию приложения для Android по ссылке");


        // второе задание
        System.out.println();
        int clientOS1 = 0;
        int clientDeviceYear = 2015;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установить облегченную версию для IOS по ссылке");
        } if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установить версию для IOS по ссылке");
        if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установить облегченную версию для Android по ссылке");
        } if (clientOS1 == 1 && clientDeviceYear >= 2015)
            System.out.println("Установить версию для Android по ссылке");
        }

        //третье задание
        System.out.println();
        int year = 2001;
        int newYear = year % 4;
        if (newYear == 0) {
            System.out.println("Високосный год " + year);
        } else
            System.out.println(year + " год не является високосным");

        // четвертое задание
        System.out.println();
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней доставки: 1");
        } if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней доставки: 2");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней доставки: 3");
        }

    }
}
