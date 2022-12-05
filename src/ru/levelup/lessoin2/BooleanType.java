package ru.levelup.lessoin2;

public class BooleanType {
    public static void main(String[] args) {
        boolean res1 = true;
        boolean res2 = false;

        int i1 = 123;
        int i2 = 124;
        int i3 = 123;
        boolean r = i1 == i2; // false/true
        boolean tr = i1 == i3; // >, <, >=, <=, !=

        boolean rt = i1 != i1 && i1 < i2;
    }
}
