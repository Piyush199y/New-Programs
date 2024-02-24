package src.Exceptions;

public class Lab047 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int x = 10 / a;
        }catch(Exception e){
            System.out.println("Exit");
            //System.exit(0);  // It will tell JVM to stop
        }
        finally {
            System.out.println("I am final, I will not be executed if System.exit is used");
        }

    }
}
