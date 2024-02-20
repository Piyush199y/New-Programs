package src.Basics_03;

public class Lab003 {
    public static void main(String[] args){
        String s1 = "New";
        String s2 = new String("New");
        String s3 = new String("new");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));  // false ? As this is case-sensitive
        System.out.println(s1.equalsIgnoreCase(s3));

    }
}
