package src.Collections03;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab066 {
    public static void main(String[] args) {
        Set<String> testcase = new TreeSet();  // It will sort the data
        testcase.add("Test case Z");
        testcase.add("Test case C");
        testcase.add("Test case F");
        testcase.add("Test case N");
        testcase.add("Test case Q");

        //System.out.println(testcase);   // Not a ideal way

        Iterator it = testcase.iterator();  // Ideal way
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(" -- SPACE -- ");

        Set testcase1 = new TreeSet();
        testcase1.add("Test case 45");
        testcase1.add("Test case 24");
        testcase1.add("Test case 88");
        testcase1.add("Test case 009");
        testcase1.add("Test case 999");

        //System.out.println(testcase1);

        Iterator it2 = testcase1.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
