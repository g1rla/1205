package ru.levelup.lession5;

import ru.levelup.lession4.Shape;

public class Triangle extends Shape {
    public Triangle(int order, String name, int a, int b, int c) {
        super(order, name, new int[] {a, b, c});
    }

    @Override
    public double calculateSquare() {
        return 2;
    }
}
