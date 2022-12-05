package ru.levelup.lession7;

//import java.util.SplittableRandom;
//
//// список на основе массива (Динамический массив)
//// 1. Добавление элемента (в начало, в конец, в середину)
//// 2. Удаление элемента (с конца, изначала, из середины)
//// 3. Получение элемента по индексу
//public class ListArray extends AbstractList {
//    private int[] elements; // элементы списка
//    private int size; // количество элементов в СПИСКЕ
//    // индекс, куда вставлять элемент при вставке в конец
//
//    // initialCapacity - первоначальный размер массива
//    public ListArray(int initialCapacity) {
//        this.elements = new int[initialCapacity];
//
//    }
//
//    // Добавление в конец списка - хранение элементов в порядке их добавления
//    // {}, [0, 0, 0, 0], size=0
//    // 1. addElements(11);
//    // {11}, [11, 0, 0, 0], size = 1;
//    // 2. addElements(23)
//    // {11, 23}, [11, 23, 0, 0], size = 2
//    // 3. addElements(45)
//    // {11, 23, 45}, [11, 23, 45, 0] size = 3
//    //4. addElements(12)
//    //    {11, 23, 45, 12}, [11, 23, 45, 12] size = 4
//    //5. addElements(13)
//    // {11, 23, 45, 12}, [11, 23, 45, 0] size = 3
//
//    @Override
//    public void addElement(int value) {
//        if (size == elements.length) { // массив заполнен и его надо увеличить
//            int[] oldArray = elements;
//            elements = new int[2 * oldArray.length];
//            System.arraycopy(oldArray, 0, elements, 0, oldArray.length);
//            //1 парамент - откуда копирует
//            //2 - с какого индекса
//            //3 - куда копируем
//            //4 - с какого элемента в элементс мы вставляем
//            //5 - кол-во элементов которые надо скопировать из олдэррей
//
//        }
//        elements[size] = value;
//        size = size + 1;
//    }
//    @Override
//    public String toString() {
//        if (size == 0) {
//            return "{}";
//        }
//        String s = "{";
//        for (int i = 0; i < size; i++) {
//            s = s + "," +elements[i] + " , ";
//        }
//        return s + "}"; //{4, 5, 6, 7 }
//    }
//}
