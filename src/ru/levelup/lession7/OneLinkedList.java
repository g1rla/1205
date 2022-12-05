package ru.levelup.lession7;
// класс реализует какой-то интерфейс
public class OneLinkedList extends AbstractList {
    private ListElement head; // null
    private ListElement tail; //null

    @Override
    public void addElement(int value) {
        // newElement - новый элемент списка, кот добавляют в конец
        ListElement newElement = new ListElement(value);
        if (head == null) { // это значит, что список пустой
            head = newElement;
            tail = newElement;
        } else {
            tail.setNext(newElement);
            tail = newElement;
            }
        size++;
        }


    @Override
    public int get(int index) {
        return 0;

    }
}
