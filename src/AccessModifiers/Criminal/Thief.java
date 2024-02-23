package src.AccessModifiers.Criminal;

import src.AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        //cop.canIshoot();  // As canIshoot is private and can be used within the given folder

    }
}
