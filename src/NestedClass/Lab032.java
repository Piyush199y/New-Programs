package src.NestedClass;

public class Lab032 {
    public static void main(String[] args) {
        OOC ooc = new OOC();
        OOC.SNCI icref = new OOC.SNCI();
        icref.show();

    }
}

class OOC{
    static int o = 100;
    int a = 90;

    static class SNCI{

        void show(){
            System.out.println(o);
        }

    }


}

