package ru.levelup.lession3;

public class Point {

    // state, field, поле, класс
    int x;
    int y;

    // <тип возвращаего значения> <имя метода>() {}
    // <тип возвращаего значения> <имя метода>(<тип аргумента1> <имя аргумента1>, <тип аргумента2> <имя аргумента2>) {}
    // int nextInt(int origin, int bound) {}
    // void как тип возвращаемого значения

    // сигнатура: changeCoordinates( int, int)
    void changeCoordinates(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }
    // flip
    // меняет координаты точки с + на -
    // (3,5) -> flip -> (-3, -5)
    // сигнатура: flip()

    void flip() {
        x = -x;  // x = (-1) * x;
        y = -y;
    }

    // quadrant
    // x > 0, y > 0 -> 1
    // результат работы метода - число от 1 до 5
//    int quadrant() {
//        int q;
//        if (x > 0 && y > 0) {
//            q = 1;
//        } else if (x < 0 && y > 0) {
//            q = 2;
//        } else if (x < 0 && y < 0) {
//            q = 3;
//        } else if (x > 0 && y < 0) {
//            q = 4;
//        } else {
//            q = 5;
//        }
//        return q; // после реторна не может быть никакого кода
    //   }
    int quadrant() {

        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 5;
        }


    }
    // p1.method() -> "(x, y)"
    // prettyString
    // сигнатура: prettyString()
    String prettyString() {
       // String s = "(" + x + ", " + y + ")";
        //return s;

        return "(" + x + ", " + y + ")";
    }

    void printPoint() {
        String s = prettyString();
        System.out.println(s);
    }
    void printPoint(boolean prettyView) {
         if (prettyView) {
             System.out.println(prettyString());
         } else {
             System.out.println(x + " " + y);
         }
    }

    // int m(double a, int b) {...} - m(double, int)
    // 1. int m(double b, int a) {} - m(double, int) - no
    // 2. int m(double а, double b) {} - m(double, double) - yes
    // 3. int m(int b) {}             - m(int) - yes
    // 4. int m(int a, double b) {} - m(int, double) - yes
    // 5. int m(double b, int a) {} - m(double, int) -no
    // 6.double m(double a, int b) {}  - m(double, int) -no
    // 7. double m(double b, int a) {} - m(double, int) -no
    // 8. int m(double a) {} - m(double) - yes
}


