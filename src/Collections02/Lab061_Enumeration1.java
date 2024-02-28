package src.Collections02;
import java.util.Enumeration;
import java.util.Vector;

/**
 *  Author - Piyush
 *  Enumeration with Vector
 */

public class Lab061_Enumeration1 {
    public static void main(String[] args){
        Vector<String> v = new Vector();
        v.add("testVector1");
        v.add("testVector2");
        v.add("testVector3");
        v.add("Enumeration is available only in Vector");

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
