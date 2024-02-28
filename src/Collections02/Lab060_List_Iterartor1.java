package src.Collections02;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Author - Piyush
 * List Iterator - Print the reverse value
 * List Iterator is used for List only
 */

public class Lab060_List_Iterartor1 {
    public static void main(String[] args){
        List testcases = new ArrayList();
        testcases.add("Newtestcase1");
        testcases.add("Newtestcase2");
        testcases.add("Newtestcase3");
        testcases.add("Newtestcase4");

        ListIterator lt = testcases.listIterator(); // Print forward
        while(lt.hasNext()){
            System.out.println(lt.next());
        }

        System.out.println("  ---  SPACE -- ");

        ListIterator lt2 = testcases.listIterator(testcases.size()); // Print the value inverse
        while(lt2.hasPrevious()){
            System.out.println(lt2.previous());
        }


    }
}
