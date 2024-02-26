package src.Throw_Throws;

import java.io.File;
import java.io.FileReader;

public class Lab051 {

    public static void main(String[] args) throws Exception {
        readFile("C://test.txt");

    }

    static void readFile(String Filename) throws Exception {  // Here it should be at method level
        File f = new File(Filename);
        FileReader fileReader = new FileReader(Filename);
        if(Filename.length() == 0){
            //throw new Exception("No file found");   // line level
        }

    }

}
