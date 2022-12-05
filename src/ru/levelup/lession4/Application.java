package ru.levelup.lession4;


public class Application {
    public static void main(String[] args) {

        //Shape nullFigure = null; // переменная ничего не хранит
        Shape figure = new Shape("Figure 1"); // shape()
        //figure.name = "Figure 1";


        System.out.println(figure.getName());
        System.out.println(figure.getName().toUpperCase());
        System.out.println(figure.getOrder());

        Shape shape = new Shape("Shape 2");
        System.out.println(shape.getName().toUpperCase());

        Shape shapeWithoutOrder = new Shape(4, "Shape with order");
        System.out.println(shapeWithoutOrder.getOrder() + " " + shapeWithoutOrder.getName());

        String fName = figure.getName();
        fName = "1234";
        System.out.println(fName + " " + figure.getName());
    }
}
