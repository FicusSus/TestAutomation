package com.bootcampexercise.module8;

import java.util.HashMap;
import java.util.Map;

public class MapActivity {
    public static void main(String[] args) {

        // 1 - Create a HashMap with String key (id) and String value (name)
        Map<String, String> map = new HashMap<>();
        map.put("101", "Alice");
        map.put("102", "Bob");
        map.put("103", "Charlie");
        map.put("104", "Disha");

        // 2 - Call print method
        MapActivity activity = new MapActivity();
        activity.print(map);
    }

    void print(Map map) {
        // 3 - Print the map using iteration
        for (Object key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}