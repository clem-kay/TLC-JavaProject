package Test.junit;

import com.clem.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LectureTest {
    @Test
    public void LectureTest(){
        List<Double> marks = new ArrayList<>();
        marks.add(70.0);
        marks.add(69.0);
        marks.add(48.0);
        marks.add(57.8);
        Student student = new Student(marks);



    }
}
