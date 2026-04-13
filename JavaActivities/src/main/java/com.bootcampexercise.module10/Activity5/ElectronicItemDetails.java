package com.bootcampexercise.module10.Activity5;

import java.util.HashMap;

public class ElectronicItemDetails {

    // 5.2 Method to return price of item
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {

        if (itemHashMap.containsKey(name)) {
            return itemHashMap.get(name);
        } else {
            System.out.println("Item not found");
            return 0;
        }
    }

    public static void main(String[] args) {

        ElectronicItemDetails obj = new ElectronicItemDetails();

        // 5.1 Create HashMap
        HashMap<String, Double> itemHashMap = new HashMap<>();

        // 5.3.1 Add 4 items
        itemHashMap.put("TV", 500.0);
        itemHashMap.put("Refrigerator", 800.0);
        itemHashMap.put("Washing Machine", 400.0);
        itemHashMap.put("Laptop", 1000.0);

        // 5.3.2 Print price
        System.out.println("Price of TV is " +
                obj.returnPriceOfItem(itemHashMap, "TV"));
    }
}