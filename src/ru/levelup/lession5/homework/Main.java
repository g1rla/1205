package ru.levelup.lession5.homework;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот", true);
        cat.sleep("Кот");
        cat.setPurebredCat(true);
        cat.eat("Кошка", "мясо");

        Dog dog = new Dog("Собака", true);
        dog.sleep("Собака");
        dog.setIsHome(true);
        dog.eat("Собака", "кости");

        Horse horse = new Horse("Лошадь", true);
        horse.sleep("Лошадь");
        horse.isHorsebackRiding(false);
        horse.eat("Лошадь", "булочку");


    }
}
