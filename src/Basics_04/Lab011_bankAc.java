package src.Basics_04;

public class Lab011_bankAc {
    public static void main(String[] args) {
        Bankac sbi = new Bankac();
        sbi.printDetails();

        Bankac hdfc = new Bankac("HDFC");
        hdfc.printDetails();
    }
}
