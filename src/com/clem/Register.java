package com.clem;

import java.util.*;
import java.util.stream.Collectors;

public class Register <T extends Student>{
    List<T> list;

    public Register(List<T> list) {
        this.list = list;
    }

    public List<String> getRegister() {
//        List<String> nameList = new ArrayList<String>();
//      for (Student s: list){
//          nameList.add(s.getName());
//      }
//      return nameList;

        return list
                .stream()
                .map(s->s.getName())
                .collect(Collectors.toList());
    }

//    public List<String> getRegisterByLevel(HasLevel.Level level){
//        List<String> studentName = new ArrayList<String>();
//        for(Student s: list){
//            if (s.getlevel() == level){
//                studentName.add(s.getName());
//            }
//        }
//        return studentName;
//    }


    public Map<HasLevel.Level, List<Student>> getRegisterByLevel(HasLevel.Level level){
        Map<HasLevel.Level, List<Student>> studentMap = new HashMap<>();

        studentMap.put(level, (List<Student>) list
                .stream()
                .filter(s-> s.getlevel() == level))
                .stream().collect(Collectors.toList());
        return studentMap;
    }

    public List<Student> sort(Comparator<Student> student){
        return list.stream().sorted(student).collect(Collectors.toList());
    }

    public String getStudentByName(String name) throws Exception {
//        String studentName = null;
//        for (Student s: list){
//                if (s.getName().equals(name)){
//                    studentName = s.getName();
//                }
//                throw new StudentNotFoundException("Student not found");
//        }
//        return studentName;

        T Student = (T) list
                .stream()
                .filter(s -> s.getName()
                        .equals(name)).findAny()
                .orElseThrow(StudentNotFoundException::new);
        return Student.getName();
    }




//    public List<String> printReport(){
//        System.out.println("Printing Student List");
//        System.out.println("======================\n");
//
//        list
//                .stream()
//                .sorted(Comparator.comparing(Student::getLevel))//sorted list based on student level
//                .forEach(s -> System.out.printf("%-30s%-15s%n", s.getName(), s.getLevel().name()));
//
//    }


    public double getOverallHighestAverage(){
        return list
                .stream()
                .map(s-> s.studentGrades)
                .flatMap(s->s.stream())
                .mapToDouble(s->s.doubleValue())
                .max().getAsDouble();
    }

    public double getOverAllHighestGrade() {
        return list
                .stream()
                .map(s -> s.studentGrades)
                .flatMap(s->s.stream())
                .mapToDouble(s->s.doubleValue())
                .average()
                .getAsDouble();
    }

    public List<Double> getGradeAboveSixty(){
        return list
                .stream().map(s-> s.studentGrades)
                .flatMap(s->s.stream())
                .filter(s-> (s > 60))
                .collect(Collectors.toList());
    }



    public  Optional<T> getOptionalStudent(String studentName) {
        return list
                .stream()
                .filter(s-> s.getName().equals(studentName))
                .findAny();
    }


    public List<T> getStudentByName(List<String> studentName){
        return (List<T>) list.stream().map(s-> {
            List<String> student = new ArrayList<>();
            studentName.stream().forEach(sn->{
                if (s.getName().equals(sn)){
                    student.add(sn);
                }
            });
            return studentName;
        });

    }

}
