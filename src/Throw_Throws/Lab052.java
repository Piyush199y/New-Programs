package src.Throw_Throws;

import java.io.File;
import java.io.FileReader;

public class Lab052 {
    public static void main(String[] args) throws Exception {
        main("test");
    }

    static void main(String a) throws Exception {

        FileReader f = new FileReader(new File("C://print.txt"));

        if (a.equalsIgnoreCase("Abc")) {

            throw new ArithmeticException("Wrong input");


        }
    }
}