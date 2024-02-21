package src.Basics_04;

public class Lab010 {
    public static void main(String[] args){

//        String s;       // Local variable default value will not be assigned by JVM
//        System.out.println(s);

        ABCperson p = new ABCperson();   // Default constructor is called by ABCperson();
        p.name = "ABC";
        System.out.println(p.name);

        p.talk();
        p.printdetails();

        // Constructor is used to construct  object of a class.




    }
}
