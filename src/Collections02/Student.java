package src.Collections02;

/**
 *  Author - Piyush
 *  Compare operator
 */
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
}
