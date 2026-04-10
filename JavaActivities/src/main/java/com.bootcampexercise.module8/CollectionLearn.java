package com.bootcampexercise.module8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionLearn {

    private final ArrayList<String> list = new ArrayList<>();
    private final HashSet<String> set = new HashSet<>();
    private final HashMap<Integer, String> map = new HashMap<>();


    // ------------------------
    // Add initial 10 values
    // ------------------------
    public void initialize() {
        for (int i = 1; i <= 10; i++) {
            list.add("Value" + i);
            set.add("Value" + i);
            map.put(i, "Value" + i);
        }
    }


    // ------------------------
    // PRINT METHODS
    // ------------------------

    public void printList() {
        System.out.println("ArrayList:");
        for (String s : list) System.out.println(s);
    }

    public void printSet() {
        System.out.println("HashSet:");
        for (String s : set) System.out.println(s);
    }

    public void printMap() {
        System.out.println("HashMap:");
        for (Integer key : map.keySet())
            System.out.println(key + " -> " + map.get(key));
    }


    // ------------------------
    // ADD METHODS (no duplicates)
    // ------------------------

    public void addToList(String value) {
        if (list.contains(value)) {
            System.out.println("Duplicate not allowed: " + value);
            return;
        }
        list.add(value);
    }

    public void addToSet(String value) {
        if (!set.add(value)) {
            System.out.println("Duplicate not allowed: " + value);
        }
    }

    public void addToMap(int key, String value) {
        if (map.containsValue(value)) {
            System.out.println("Duplicate value not allowed: " + value);
            return;
        }
        map.put(key, value);
    }


    // ------------------------
    // REMOVE METHODS
    // ------------------------

    public void removeFromList(String value) {
        list.remove(value);
    }

    public void removeFromSet(String value) {
        set.remove(value);
    }

    public void removeFromMap(int key) {
        map.remove(key);
    }


    // ------------------------
    // REPLACE METHODS (no duplicates)
    // ------------------------

    public void replaceInList(int index, String newValue) {
        if (list.contains(newValue)) {
            System.out.println("Duplicate replacement blocked: " + newValue);
            return;
        }
        if (index >= 0 && index < list.size())
            list.set(index, newValue);
    }

    public void replaceInSet(String oldValue, String newValue) {
        if (!set.contains(oldValue)) return;
        if (set.contains(newValue)) {
            System.out.println("Duplicate replacement blocked: " + newValue);
            return;
        }
        set.remove(oldValue);
        set.add(newValue);
    }

    public void replaceInMap(int key, String newValue) {
        if (map.containsValue(newValue)) {
            System.out.println("Duplicate replacement blocked: " + newValue);
            return;
        }
        if (map.containsKey(key))
            map.put(key, newValue);
    }


    // ------------------------
    // MAIN METHOD
    // ------------------------

    public static void main(String[] args) {

        CollectionLearn obj = new CollectionLearn();

        obj.initialize();

        System.out.println("=== INITIAL VALUES ===");
        obj.printList();
        obj.printSet();
        obj.printMap();

        System.out.println("\n=== ADD VALUES ===");
        obj.addToList("New");
        obj.addToSet("New");
        obj.addToMap(11, "New");

        obj.printList();
        obj.printSet();
        obj.printMap();

        System.out.println("\n=== REMOVE VALUES ===");
        obj.removeFromList("Value3");
        obj.removeFromSet("Value5");
        obj.removeFromMap(2);

        obj.printList();
        obj.printSet();
        obj.printMap();

        System.out.println("\n=== REPLACE VALUES ===");
        obj.replaceInList(0, "Replaced");
        obj.replaceInSet("Value4", "Replaced2");
        obj.replaceInMap(3, "Replaced3");

        obj.printList();
        obj.printSet();
        obj.printMap();
    }
}