package ru.levelup.lession7;

public class ListElement {
    private ListElement next; // null
    private int value;
    public ListElement(int value) {

    }

    public ListElement getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
