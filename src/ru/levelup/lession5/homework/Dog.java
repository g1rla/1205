package ru.levelup.lession5.homework;

public class Dog extends Animal {

    public boolean isHome;
    public Dog(String nameAnimal, boolean isHome) {
        this.isHome = isHome;
    }
    public boolean setIsHome(boolean isHome) {
        this.isHome = isHome;
        if (isHome)
            System.out.println("Собака живет дома");
        else
            System.out.println("Собака живет на улице");
        return true;
    }
    @Override
    public void eat(String nameAnimal, String food) {
        System.out.println(nameAnimal + " хочет погрызть " + food);
    }
}
