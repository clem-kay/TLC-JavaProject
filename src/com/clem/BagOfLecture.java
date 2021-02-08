package com.clem;

import java.util.ArrayList;
import java.util.List;

public class BagOfLecture {
    List<Student> lectureList = new ArrayList<>();

    public void addLecture(Student student){
        lectureList.add(student);
    }
    public void removeLecture(Student student){
        lectureList.remove(student);
    }
    public void clear(){
        lectureList.clear();
    }

}
