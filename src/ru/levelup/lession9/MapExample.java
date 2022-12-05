package ru.levelup.lession9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Milk", 65.36);
        productPrices.put("Cheese", 536.23);
        productPrices.put("Tomatoes", 65.023);
        productPrices.put("Cucumber", 1.2);
        productPrices.put("Bread", 1.3);

        //productPrices.put("Milk", 56,45); - заменит первое значение
        System.out.println("Milk exist: " + productPrices.containsKey("Milk"));
        //1 var: keySet
        Set<String> keys = productPrices.keySet(); //
        for (String key : keys) {
            Double price = productPrices.get(key);
            System.out.println(key + " costs " + price);
        }

        // 2var: entrySet
        // Map.java -> Map, Entry
        // Map.class, Map$Entry.class
        //Map m; Map(имя внешнего класс).Entry(имя внутреннего класса) e;
        //Map.Entry<String, Double> entry;
        Set<Map.Entry<String, Double>> entries = productPrices.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey() + " costs " + entry.getValue());

        }
    }

}
