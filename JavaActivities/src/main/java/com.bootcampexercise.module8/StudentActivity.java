package com.bootcampexercise.module8;

import java.util.ArrayList;

public class StudentActivity {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // Add students
        addStudent(students, new Student(1, "Alice", 85.5));
        addStudent(students, new Student(2, "Bob", 90.0));
        addStudent(students, new Student(3, "Charlie", 78.2));
        addStudent(students, new Student(4, "Disha", 92.8));

        System.out.println("All Students:");
        printAllStudents(students);

        // Remove student with ID = 3
        students.removeIf(s -> s.getId() == 3);

        System.out.println("\nAfter Removing ID 3:");
        printAllStudents(students);

        // Find highest grade
        Student top = findHighest(students);
        System.out.println("\nHighest Grade Student:");
        top.printStudent();
    }

    // Add student (prevent duplicate ID)
    public static void addStudent(ArrayList<Student> list, Student s) {
        for (Student st : list) {
            if (st.getId() == s.getId()) {
                System.out.println("Duplicate ID found. Student not added: " + s.getId());
                return;
            }
        }
        list.add(s);
    }

    // Print all
    static void printAllStudents(ArrayList<Student> list) {
        for (Student s : list) {
            s.printStudent();
        }
    }

    // Find highest grade student
    public static Student findHighest(ArrayList<Student> list) {
        Student highest = list.getFirst();
        for (Student s : list) {
            if (s.getGrade() > highest.getGrade()) {
                highest = s;
            }
        }
        return highest;
    }
}
