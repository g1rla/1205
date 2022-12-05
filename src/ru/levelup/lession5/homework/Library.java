package ru.levelup.lession5.homework;

public class Library {

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.name = "Петров В.В";
        reader.birthday = "13.05.1991";
        reader.phoneNumber = "111111";

        String[] nameBook = new String[3];
        nameBook[0] = "Приключения";
        nameBook[1] = "Словарь";
        nameBook[2] = "Энциклопедия";
        reader.takeBook(nameBook);

        reader.takeBook(3);

    }

}
