package src.Collections03;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab065 {
    public static void main(String[] args) {
        Set<String> testcase = new HashSet();  // It will store data randomly
        testcase.add("Test case design");
        testcase.add("Test case technique");
        testcase.add("Test case writing");
        testcase.add("Test case execution");
        testcase.add("Test case review");

        System.out.println(testcase); // Normal print

        for(Object o : testcase){
            System.out.println(o);
        }

        System.out.println(" -- SPACE --- ");

        Iterator it = testcase.iterator();  // Ideal way to print the Set
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
