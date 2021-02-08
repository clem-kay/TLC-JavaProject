package com.clem;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudent {
    List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void removeStudent(Student student){
        studentList.remove(student);
    }
    public void clear(){
        studentList.clear();
    }
}
