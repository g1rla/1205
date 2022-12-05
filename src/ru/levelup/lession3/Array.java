package ru.levelup.lession3;

public class Array {
    public static void main(String[] args) {
        double price1 = 345.65;
        double price2 = 456.12;
        double price3 = 12.5;
        double price4 = 1.48;

        double avgPrice = (price1 + price2 + price3 + price4) / 4;
        System.out.println("Average price: " + avgPrice);
        // double [] prices вквадратные скобки говорят что это массив
        // число в квадратных скобках это длина массива
        double [] prices = new double[5];
        // записать значение в элеменнт массива (сохранить значение вмассив)
        prices[0] = price1; // записали значение 345.65 в нулевой элемент массива
        prices[1] = price2;
        prices[2] = price3;
        prices[3] = price4;
        prices[4] = 456;

        for (int i = 0; i < prices.length; i++) {
            // номер товара - цена
            int number = i + 1;
            System.out.println(number + " - " + prices[i]);
        }

        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
        }
        double avg = sum / prices.length;
        System.out.println("Average price (array): " + avg);



    }
}
