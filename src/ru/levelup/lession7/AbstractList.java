package ru.levelup.lession7;

public abstract class AbstractList implements ListInterface {
    // нельзя созать объект абстрактного класс  и вызвать конструктор
    // может содержать абстрактные методы
    protected int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;

    }
        @Override
        public void add ( int value) {
            System.out.println("Method add has been invoked");
        addElement(value);
        }


    public abstract void addElement(int value);
   // public abstract int get(int index); // у метода нет тела (то что делает метод - не описано

}
