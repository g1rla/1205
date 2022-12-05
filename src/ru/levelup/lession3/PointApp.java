package ru.levelup.lession3;

public class PointApp {
    public static void main(String[] args) {
        // object, reference, instance, объект, ссылка, экземпляр
        int xp1 = 4;

        Point p1 = new Point(); // вызов конструктора это new+круглые скобки
        // оператор new определяет сколько нужны выделить памяти и генерирует ссылку на эту память
        p1.x = 5; //используем ссылку кот хранится в переменной п1. Это объект
        p1.y = 7;

        p1.flip();
        String prettyPoint = p1.prettyString();
        System.out.println(prettyPoint);
        System.out.println(p1.prettyString()); // для этого не нужна была 14 строка

        int result = p1.quadrant();
        System.out.println("P1 quadrant" + result);

        //мы в ячейку памяти записываем 5. Значение х = 5
        Point p2 = new Point();
        p2.x = 8;
        p2.y = 8;

        p2.prettyString();
        p2.printPoint(false);

        System.out.println("P1: x = " + p1.x);
        System.out.println("P2: x = " + p2.x);

        int coor = 12;
        p1.changeCoordinates(9, coor);
        System.out.println("P1: x = " + p1.x);
        p1.changeCoordinates(coor, coor);
        System.out.println("P1: x = " + p1.x);




    }
}
