package ru.levelup.lession8;



public class ObjectArray<TYPE> {
    private Object[] array;

    public ObjectArray() {
        this.array = new Object[3];
    }
    public void putIntoArray(TYPE value, int idx) {
        array[idx] = value;


    }
    public Object get(int idx) {
        return array[idx];
    }
}
