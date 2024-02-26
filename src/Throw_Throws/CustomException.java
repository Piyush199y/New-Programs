package src.Throw_Throws;

public class CustomException extends Exception{

    CustomException(String msg){
        super(msg);
        System.out.println("I got this custom exception. !!");
    }

}
