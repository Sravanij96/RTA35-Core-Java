package com.bharath.oops.assignment;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int rollNo;

    // Constructor to initialize name and rollNo
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    // toString method for printing student details
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}

class University {
    private List<Student> students;

    // Constructor initializes the students list
    public University() {
        this.students = new ArrayList<>();
    }

    // Method to add a student to the university
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to list all students in the university
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the university.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

public class Aggregation {
    public static void main(String[] args) {
        // Create some student instances
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Student student3 = new Student("Charlie", 103);

        // Create university instance
        University university = new University();

        // Add students to the university
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        // List students in the university
        System.out.println("Students in the university:");
        university.listStudents();

        // Simulating the university removal
        university = null;  // This removes the reference to the University object

        // List students after the university reference is removed
        System.out.println("\nAfter university reference is removed:");
        System.out.println(student1);  // Student still exists
        System.out.println(student2);  // Student still exists
        System.out.println(student3);  // Student still exists
    }
}