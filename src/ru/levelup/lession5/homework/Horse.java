package ru.levelup.lession5.homework;

public class Horse extends Animal {
    public boolean horsebackRiding;
    public Horse(String nameAnimal, boolean horsebackRiding){
        this.horsebackRiding = horsebackRiding;
    }
    public boolean isHorsebackRiding(boolean horsebackRiding) {
        this.horsebackRiding = horsebackRiding;
        if (horsebackRiding)
            System.out.println("Лошадь участвует в конном спорте");
        else
            System.out.println("Лошадь не участвует в конном спорте");
        return true;
    }
    @Override
    public void eat(String nameAnimal, String food) {
        System.out.println(nameAnimal + " хочет " + food);
    }

}

