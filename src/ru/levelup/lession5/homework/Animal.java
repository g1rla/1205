package ru.levelup.lession5.homework;

public class Animal {
    protected String food;
    protected  String location;
    protected String nameAnimal;
    protected String sound;

    public void sleep (String nameAnimal) {
        this.nameAnimal = nameAnimal;
        System.out.println(nameAnimal + " сейчас спит");

    }
    public void eat(String nameAnimal, String food) {
        this.food = food;
        this.nameAnimal = nameAnimal;
        System.out.println(nameAnimal + " питается " + food);
    }
    public void makeNoise(String sound) {
        this.sound = sound;
        System.out.println(nameAnimal + " редко шумит");
    }

}
