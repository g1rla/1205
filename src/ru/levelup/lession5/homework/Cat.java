package ru.levelup.lession5.homework;

public class Cat extends Animal {
    public boolean purebredCat;

    public Cat(String nameAnimal, boolean purebredCat) {
        this.purebredCat = purebredCat;

    }
//    public Cat(boolean purebredCat) {
//        this.purebredCat = purebredCat;
//    }

    public boolean setPurebredCat(boolean purebredCat) {
        this.purebredCat = purebredCat;
        if (purebredCat == true)
            System.out.println("Кошка породистая");
        else
            System.out.println("Кошка не породистая");
        return true;
    }
    @Override
    public void eat(String nameAnimal, String food) {
        System.out.println(nameAnimal + " любит есть " + food);
    }

}
