package kz.bitlab.springboot.SprintTask1.db;

import kz.bitlab.springboot.SprintTask1.models.Student;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(1L,"Ivan","Ivanov",91,""));
        students.add(new Student(2L,"Petr","Petrov",47,""));
        students.add(new Student(3L,"Sidor","Sidorov",58,""));
        students.add(new Student(4L,"Semen","Semenov",88,""));
        students.add(new Student(5L,"Roman","Romanov",66,""));
    }

    public static List<Student> getStudents(){
        for(int i=0;i<students.size();i++) {
            int rez = students.get(i).getExam();
            if (rez<101 && rez>89)
                students.get(i).setGrade("A");
            else if (rez<90 && rez>74)
                students.get(i).setGrade("B");
            else if (rez<75 && rez>59)
                students.get(i).setGrade("C");
            else if (rez<60 && rez>49)
                students.get(i).setGrade("D");
            else
                students.get(i).setGrade("F");
        }
        return students;
    }

    public static void addStudent(Student student){
        student.setId(students.size()+1L);
        students.add(student);
    }
}
