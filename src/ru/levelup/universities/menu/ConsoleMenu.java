package ru.levelup.universities.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleMenu {
    // InputStream
    // OutputStream
    // Reader
    // Writer
    // final - поле, котОторое нельзя изменить после инициализации

    private final BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    public void printMainActions() {
        System.out.println("Available actions: ");
        System.out.println("1. Print universities list");
        System.out.println("0. Exit");
    }

    public int readActionNumber() {
        System.out.println();
        System.out.println("Enter Action Number: ");

        try {
            String line = consoleReader.readLine(); //
            return Integer.parseInt(line);
        } catch (IOException exc) {
            System.out.println("Couldn't read from console: " + exc.getMessage());
        } catch (NumberFormatException exc) {
            System.out.println("You entered invalid number");
        }
        // в случае, если у нас какая-то ошибка получения с консоли, возвращаем -1
        return -1;
    }
}
