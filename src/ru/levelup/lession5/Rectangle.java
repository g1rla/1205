package ru.levelup.lession5;

import ru.levelup.lession4.Shape;
// Rectangle является наследником класса Shape
// тот класс, от которого унаследовалось - родительский, базовый, суперкласс
// тот класс, который унаслдовался - дочерний, подкласс, наследник

public class Rectangle extends Shape {

    //int width;
    //int length;

    public Rectangle() {

        super(); // пишется если в родительском классе есть конструктор без параметров
        System.out.println("Rectangle constructor ...");
    }

    public Rectangle(int order, String name, int width, int length) {
        super(order, name, new int[]{width, length, width, length});
    }

//    public double calculatePerimeter() {
//        return width * 2 + length * 2;
//
//
//    }
    public Rectangle(String name) {
        super(name);
    }

    public int getWidth() {
        return sides[0];
    }

    public int getLength() {

        return sides[1];
    }

    @Override
    public double calculateSquare() {
        return getLength() * getWidth();
    }


}
