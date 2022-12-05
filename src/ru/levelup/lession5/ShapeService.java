package ru.levelup.lession5;

import ru.levelup.lession4.Shape;

public class ShapeService {

    public void printShapeSquare(Shape shape) {
        System.out.println("Shape's square: " + shape.calculateSquare());
    }

    public void printRectangleSquare(Rectangle rectangle) {
        System.out.println("Shape's square: " + rectangle.calculateSquare());

    }
}
