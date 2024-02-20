package src.Basics_03;

public class Lab002 {
    public static void main(String[] args) {

            String s = "New";
            System.out.println(s.concat("Program"));
            System.out.println(s + "program");
            System.out.println(s.contains("e"));

            String expected = "Password@123";
            String actual = "password@123";
            if(expected.equalsIgnoreCase(actual)){
                System.out.println("True");
            }

    }
}
