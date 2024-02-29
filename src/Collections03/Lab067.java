package src.Collections03;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab067 {
    public static void main(String[] args){
        Set<String> testcase = new LinkedHashSet(); // // It will keep the order of the data
        testcase.add("test 5");
        testcase.add("test 4");
        testcase.add("test 1");
        testcase.add("test 6");
        testcase.add("test 8");

        Iterator it = testcase.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
