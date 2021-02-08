package com.clem;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException(){
        super("Student not found");
    }
}
