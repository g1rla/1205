package ru.levelup.lession9;

public class ExceptionExecution {
    public double sqrt(double value) {
        if (value < 0) {
            // создание объекта
            //IllegalArgumentException exc = new IllegalArgumentException("Value must be non-negative");
            // генерация исключенияе (выброс исключения)
           // throw exc;
            throw  new IllegalArgumentException("Value must be non-negative");

        }
        return Math.sqrt(value);

    }
    public double division(double a, double b) throws DivideOnZeroException{
        if (b == 0) {
            throw new DivideOnZeroException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        ExceptionExecution execution = new ExceptionExecution();
        // try-catch-finally
        try {
            double res = execution.division(34, 0);
            System.out.println("After division: " + res);
        } catch (DivideOnZeroException exc) {
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        } finally {
            System.out.println("Always will be executed");
        }

        execution.sqrt(-3);


    }
}
