package Test.junit;

import com.clem.Lecture;
import com.clem.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private double DELTA = 0.8;
    @Test
    public void StudentTest(){
        List<Double> marks = new ArrayList<>();
        marks.add(70.0);
        marks.add(69.0);
        marks.add(48.0);
        marks.add(57.8);
        Student student = new Student(marks);
        Student student1 = new Student(marks);

        double expectedAverage =(70.0+69.0+48.0+57.8)/marks.size();
        System.out.println(expectedAverage);

        double actualAverage = student.getAverageGrade();
        System.out.println(actualAverage);

        Lecture lecture = new Lecture();
        Lecture lecture1 = new Lecture();

        lecture1.enter(student1);
        lecture.enter(student);
        lecture.enter(student1);
        lecture.getHighestAverageGrade();

        assertEquals(62.0,actualAverage,DELTA);
    }
}
