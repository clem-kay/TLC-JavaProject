package com.clem;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> studentGrade) {
        super(studentGrade);
    }

    @Override
    public double getAverageGrade() {
        double average = super.getAverageGrade() + (super.getAverageGrade()*0.1);
        return average;
    }
}
