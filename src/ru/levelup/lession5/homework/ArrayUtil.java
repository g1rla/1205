package ru.levelup.lession5.homework;

public class ArrayUtil {

    public int min(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minimum < array[i])
                array[i] = minimum;
        }
        return minimum;
    }

    public int max(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maximum > array[i])
                array[i] = maximum;
        }
        return maximum;
    }
}
