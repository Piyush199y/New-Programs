package src.Basics_04;

public class Lab012_Person {
    public static void main(String[] args) {
        PersonThree p = new PersonThree();
        new PersonThree();  // Still default constructor will be called

        PersonThree p1 = new PersonThree("JAVA ref name Piyush" , 24);
        p1.printDetails();

        PersonThree p2 = new PersonThree("JAVA ref name Nehal" , 27);
        p2.printDetails();

    }
}
