package src.Exceptions;

public class Lab044 {
    public static void main(String[] args) {
        try{
        String name = null;
        name.trim();
        System.out.println("will this run?");

    }catch(Exception e){
            System.out.println("You are trying to print a null string");}
        System.out.println("Hi this is the end");
    }

}
