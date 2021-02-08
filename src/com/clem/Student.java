package com.clem;

import java.util.List;
import java.util.stream.DoubleStream;

public class Student implements Nameable,HasLevel {
    List<Double> studentGrades;
    private String studentName;
    private Level level;

    public Student (List<Double> studentGrade){
        this.studentGrades = studentGrade;
    }
    public Student (List<Double> studentGrade, String name){
        this.studentGrades = studentGrade;
        this.studentName = name;
    }
    public Student (List<Double> studentGrade, String name, Level level){
        this.studentGrades = studentGrade;
        this.studentName = name;
        this.level = level;
    }


    public double getAverageGrade(){
        double total = 0.0;
        for(double d : studentGrades){
            total += d;
        }

        return total / studentGrades.size();
    }

    @Override
    public String getName() {
        return this.studentName;
    }

    @Override
    public Level getlevel() {
        return this.level;
    }

//    public DoubleStream getGradeAsDoubleStream() {
//        return (DoubleStream) studentGrades.stream();
//    }
}
