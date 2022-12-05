package ru.levelup.lession4;

import java.util.SplittableRandom;

// Access modifiers (модификаторы доступа)
// 1. private - доступ только внутри класса внутри {}
// 2. private-package (default-package) - отсутствие модификатора - private + доступ на уровне пакета
// 3. protected - предыдущий + доступ в классе-наследнике (даже если он в другом пакете)
// 4. public - доступ разрешен везде
public class Shape {

    protected int order;
    protected String name; // название фигуры

    protected int[] sides;

    public Shape() {
        System.out.println("123");
    }


    public Shape(String name) {
        this(1, name);
    }


    public Shape(int order, String name, int[] sides) {
        this.order = order;
        this.name = name;
        this.sides = sides;
    }

    public Shape(int i, String name) {
    }

    public int getOrder() {
        return order;
    }

    // getter
    // public <field_type> get<Field_name>()  (возвращает поле)
    public String getName() {
        return name;
    }

    // setter
    // public void set<Field_name>(<field_type> <field_name>) {field = field_name;}
    // obj.name = ""
    public void setName(String name) {
        //this
        this.name = name;


    }

    public double calculatePerimeter() {
        int perimeter = 0;
        for (int i = 0; i < sides.length; i++) {
            perimeter = perimeter + sides[i];
        }
        return perimeter;
    }

    public double calculateSquare() {
        return 0;
    }

}
