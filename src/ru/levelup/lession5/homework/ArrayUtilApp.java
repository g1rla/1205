package ru.levelup.lession5.homework;

import java.util.Arrays;

public class ArrayUtilApp {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayMin = new int[] {1, 2, 3, 4, 5};
        //arrayUtil.min(arrayMin);
        System.out.println(arrayUtil.min(arrayMin));
        System.out.println(arrayUtil.max(arrayMin));

    }


}
