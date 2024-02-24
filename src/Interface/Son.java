package src.Interface;

public class Son implements FatherI {


    @Override
    public void loan1l() {
        FatherI.print2();
        System.out.println("I will also pay in loan");
    }
}
