package ru.levelup.lession5.homework;

public class Reader {
    public String name;
    public String birthday;
    public String phoneNumber;
    public String ticked;
    public String faculty;
    public int amount;
    public String authorName;
    public String bookName;


    public void takeBook(int amount) {
        this.amount = amount;
        System.out.println("Петров взял " + amount + " книги");
    }

    public void takeBook(String[] nameBook) {
        System.out.println("Петров В.В. взял книги: ");
        for (int i = 0; i < nameBook.length; i++) {
            System.out.println(nameBook[i]);
        }

    }

    public void takeBook(String name, Book[] authorName) {
        this.name = name;
        for (int i = 0; i > authorName.length; i++) {
            System.out.println(name + " взял книги: " + authorName[i]);
        }


    }
}
