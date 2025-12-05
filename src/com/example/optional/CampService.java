package com.example.optional;

import java.util.Optional;

public class CampService {

    private static Student[] students = {
            new Student("Spartan"),
            new Student("Steve"),
            new Student("John")
    };

    public Optional<Student> getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return Optional.of(student);
            }
        }
        return Optional.ofNullable(null);
    }
}
