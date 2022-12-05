package ru.levelup.lession8;

import ru.levelup.lession7.ListInterface;

public class InterfaceService {
    public void printRange(ListInterface list, int start, int end) {
        for (int i = start; i < end; i++) {
            int value = list.get(i);
            System.out.println(value);
        }
    }
}
