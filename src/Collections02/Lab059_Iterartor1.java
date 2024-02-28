package src.Collections02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab059_Iterartor1 {
    public static void main(String [] args){
        List<String> testlist = new ArrayList<>(); // For datatype in List we cant use the primitive data type like
        testlist.add("testcase");                  // int, float. double instead use
        testlist.add("testcase");                  // wrapper class like Integer, String,  Float, Double etc
        testlist.add("testcase");
        testlist.add("testcase");

        List testnumber = new ArrayList();  // If we dont use <> (Diamond operator) then
        testnumber.add(1);                  // It will be stored as the Object only
        testnumber.add(2);
        testnumber.add(3);
        testnumber.add(4);

        testlist.addAll(testnumber);
        System.out.println(testlist);

        Iterator iterator = testlist.iterator();   // Custom iterator
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
