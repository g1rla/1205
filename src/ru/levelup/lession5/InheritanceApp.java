package ru.levelup.lession5;

import ru.levelup.lession4.Shape;

public class InheritanceApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setName("Rectangle AB");

        //System.out.println(rectangle.getName());

        //rectangle.length = 3;
       // rectangle.width = 5;

        //double perimeter = rectangle.calculatePerimeter();
        //System.out.println(rectangle.getName() + ": perimeter = " + perimeter);


        Rectangle rectangleWithName = new Rectangle("Rect name");
        System.out.println("Name: " + rectangleWithName.getName());

        // int[] array = new int [4];
        // array[0] = 45;
        // array[1] = 46;

        //int[] array = new int[] {4, 5, 6, 7, 8};
        //int[] array = {a, b, c}
        Rectangle rect = new Rectangle(3, "R3", 8, 3);
        double perimeter = rect.calculatePerimeter();
        System.out.println(rect.getName() + ": perimeter = " + perimeter);

        Shape shape = new Shape();

        Triangle triangle = new Triangle(4,"T4", 3, 4, 5);
        System.out.println("Shape's square: " + shape.calculateSquare());
        System.out.println("Rectangle's square: " + rect.calculateSquare());
        System.out.println("Triangle's: " + triangle.calculateSquare());


        ShapeService shapeService = new ShapeService();
        shapeService.printRectangleSquare(rect);
        shapeService.printShapeSquare(shape);


    }
}
