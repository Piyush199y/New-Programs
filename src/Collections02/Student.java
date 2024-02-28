package src.Collections02;

import java.util.Comparator;

/**
 *  Author - Piyush
 *  Compare operator
 */

class Asc implements Comparator<Student>{
    public int compare (Student o1, Student o2 ){
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class Dec implements Comparator<Student>{
    public int compare (Student o1, Student o2 ){
        return Integer.compare(o2.getId(),o1.getId());
    }
}

class sortByname implements Comparator<Student>{
    public int compare (Student o1, Student o2){
        return o1.getName().compareTo(o2.getName());
    }
}


public class Student implements Comparable<Student>{
    Integer id;
    String name;

    @Override
    public String toString() {   // To print the list of the students properly
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

//    @Override
//    public int compareTo(Student o) {       // By this we can sort by name
//        return CharSequence(this.name, o.name); // But only 1 reference either ID or NAME is allowed
//    }                                           // in Comparable Interface
}
