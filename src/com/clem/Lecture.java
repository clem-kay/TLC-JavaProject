package com.clem;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    List<Student> studentList = new ArrayList<>();
    List<Double> averageGrade = new ArrayList<>();

    public void enter(Student student){
        studentList.add(student);
        averageGrade.add(student.getAverageGrade());
    }


    public double getHighestAverageGrade(){
        double max = 0.0;
        for( double g:averageGrade){
            if(g > max){
                max=g;
            }
        }
        return max;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
