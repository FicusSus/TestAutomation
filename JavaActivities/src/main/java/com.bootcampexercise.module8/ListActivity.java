package com.bootcampexercise.module8;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        // 1 - Create list of names
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // 2 - Call print method
        print(names);
    }

    static void print(List<String> list) {
        // 3 - Print the list
        for (String name : list) {
            System.out.println(name);
        }
    }
}