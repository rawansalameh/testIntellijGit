package com.jetbrains;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class UniversityCourse {
    private String courseName;
    private String instructorName;
    private ArrayList<String> students = new ArrayList<>();

    public UniversityCourse(String courseName, String instructorName) {
        this.courseName = courseName;
        this.instructorName = instructorName;
    }

    public void register(String studentname) {
        if (studentname == null) {
            throw new IllegalArgumentException();
        } else {
            students.add(studentname);
        }
   public boolean isRegistered(String studentName)
{
    return students.contains(studentName);
}
    }
}

