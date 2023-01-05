package com.codewallah.StudentTeacher;

import java.util.*;
public class Student {
    public int stid;
    public String name;
    public int age;
    public int classroom;
    public List<Teacher> teachers;

    public Student(int stid, String name, int age, int classroom) {
        this.stid = stid;
        this.name = name;
        this.age = age;
        this.classroom = classroom;
    }
}
