package com.bootcampexercise.module9;

import com.bootcampexercise.module8.Student;
import com.bootcampexercise.module8.StudentActivity;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    // 1. Test Student constructor + getters
    @Test
    void testStudentCreation() {
        Student s = new Student(1, "Alice", 85.5);

        assertEquals(1, s.getId());
        assertEquals("Alice", s.getName());
        assertEquals(85.5, s.getGrade());
    }

    // 2. Test setters
    @Test
    void testSetters() {
        Student s = new Student(1, "A", 50);

        s.setName("Bob");
        s.setGrade(90);

        assertEquals("Bob", s.getName());
        assertEquals(90, s.getGrade());
    }

    // 3. Test addStudent prevents duplicates
    @Test
    void testAddStudentNoDuplicate() {
        ArrayList<Student> list = new ArrayList<>();

        StudentActivity.addStudent(list, new Student(1, "A", 50));
        StudentActivity.addStudent(list, new Student(1, "B", 70)); // duplicate

        assertEquals(1, list.size());
    }

    // 4. Test addStudent adds correctly
    @Test
    void testAddStudent() {
        ArrayList<Student> list = new ArrayList<>();

        StudentActivity.addStudent(list, new Student(1, "A", 50));
        StudentActivity.addStudent(list, new Student(2, "B", 70));

        assertEquals(2, list.size());
    }

    // 5. Test findHighest logic
    @Test
    void testFindHighest() {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "A", 50));
        list.add(new Student(2, "B", 90));
        list.add(new Student(3, "C", 70));

        Student highest = StudentActivity.findHighest(list);

        assertEquals(2, highest.getId());
        assertEquals(90, highest.getGrade());
    }

    // 6. Edge case: single student
    @Test
    void testFindHighestSingle() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Solo", 100));

        Student highest = StudentActivity.findHighest(list);

        assertEquals(100, highest.getGrade());
    }
}