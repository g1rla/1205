package ru.levelup.lession7;
// 1. Нет конструкторов
// 2. Все методы являются абстрактными (нет тела) и публичными по умолчанию
// нет смысла писать слова public abstract
// - с 8ой Java появились default методы
// - с 9ой Java появились private методы
// 3. Поля интерфейса являютя константами - public static final
// 4. не используются в наследовании,
// 5. Это описание действий
public interface ListInterface {

    int get(int index);

    void add(int value);
}
