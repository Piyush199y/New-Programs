package src.NestedClass;

public class Lab034 {
    public static void main(String[] args) {
        Student s1 = new Student() {
            @Override
            public void setId() {

            }
        };

        s1.setId();
    }

    B b = new B(){
      // This is an anonymous class
    };

}

abstract class B{
    int i = 10;
}

interface Student{
     int id = 11;
     void setId();

}
