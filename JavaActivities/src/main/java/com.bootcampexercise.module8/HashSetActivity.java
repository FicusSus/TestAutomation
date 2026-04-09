package com.bootcampexercise.module8;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class HashSetActivity {

    public static void main(String[] args) {
        // 1 - Create HashSet of 10 names
        HashSet<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Disha");
        names.add("Eve");
        names.add("Frank");
        names.add("Grace");
        names.add("Harry");
        names.add("Isha");
        names.add("John");

        System.out.println("Original HashSet:");
        printSet(names);

        // 2 - Add duplicate values
        names.add("Alice");
        names.add("Bob");

        System.out.println("\nAfter adding duplicates:");
        printSet(names);

        // 3 - Remove 2 values
        names.remove("Eve");
        names.remove("Frank");

        System.out.println("\nAfter removing 2 values:");
        printSet(names);

        // 4 - Find "index" of Disha
        List<String> nameList = new ArrayList<>(names);
        int index = nameList.indexOf("Disha");
        if (index != -1) {
            System.out.println("\nIndex of Disha in HashSet (converted to List) is: " + index);
        } else {
            System.out.println("\nDisha not found in HashSet");
        }
    }

    static void printSet(HashSet<String> set) {
        for (String name : set) {
            System.out.println(name);
        }
    }
}
