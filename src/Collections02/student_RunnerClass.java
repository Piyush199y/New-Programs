package src.Collections02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class student_RunnerClass {
    public static void main(String[] args) {
        Student student3 = new Student(3, "testEnv");
        Student student5 = new Student(5, "testResult");
        Student student2 = new Student(2, "testPlan");
        Student student1 = new Student(1, "testcase");
        Student student4 = new Student(4, "testExec");

        List<Student> students = new ArrayList<>();
        students.add(student3);
        students.add(student5);
        students.add(student2);
        students.add(student1);
        students.add(student4);
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);








    }
}
