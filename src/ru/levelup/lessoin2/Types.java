package ru.levelup.lessoin2;

public class Types {
    public static void main(String[] args) {
        System.out.println(123); // int
        System.out.println(123L); // long
        System.out.println(123f); // float
        System.out.println(123d); //double
        System.out.println(123.34); //double
        System.out.println(123.34f); //float
        //явное преобразование
        // неявное

        // сужающее
        // расширяющее

        int intVariable = 536;
        long longVariable = intVariable; // неявное расширющее 4б преобразовали в 8б
        byte byteVariable = (byte) longVariable; // явное сужающее преобразование (лонг запихиваем в байт)
        //
        int intByteVariable = (byte) longVariable; // лонг в байт, потом байт в инт

    }
}
