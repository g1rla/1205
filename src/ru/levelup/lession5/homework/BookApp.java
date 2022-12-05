package ru.levelup.lession5.homework;

public class BookApp {
    public static void main(String[] args) {
        Book bookApp = new Book();

        bookApp.nameBook = "Евгений Онегин";
        bookApp.authorBook = "А.С.Пушкин";

        String [] authorName = new String[2];
        authorName[0] = "Евгений Онегин";
        authorName[1] = "А.С,Пушкин";
        bookApp.takeBook(authorName);

    }

}
