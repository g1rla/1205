package ru.srypro.hometask;

import java.sql.SQLOutput;

public class variable {
    public static void main(String[] args) {


        // первое задание
        byte a = 1;
        short b = 100;
        int c = 5000;
        long d = 177L;
        float f = 1.5f;
        double e = 2.356;
        boolean word = true;
        char g = 12;

        // второе задание
        float sportsman1 = 78.2f;
        float sportsman2 = 82.7f;
        float generalWeight = sportsman1 + sportsman2;
        float differenceWeight = sportsman2 - sportsman1;
        System.out.println("Общий вес спортсменов " + generalWeight + " кг ");
        System.out.println("Один спортсмен тяжелее другого на " + differenceWeight + " кг ");
        System.out.println();

        // третье задание
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int recipe = banana * 5 + milk * 2 + iceCream * 2 + egg * 4;
        int recipe1 = recipe / 1000;
        System.out.println("Общий вес завтрака " + recipe1 + "кг");
        System.out.println();


        // четвертое задание



    }


}
