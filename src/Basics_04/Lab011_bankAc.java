package src.Basics_04;

public class Lab011_bankAc {
    public static void main(String[] args) {
        Bankac sbi = new Bankac();
        sbi.printDetails();

        Bankac hdfc = new Bankac("HDFC" , "HDFC001");
        hdfc.printDetails();

        Bankac icici = new Bankac("ICICI", "ICICI001");
        icici.printDetails();

        Bankac kotak = new Bankac("KOTAK", "KOTAK001");  // We can do quick updation in the constructor also
        kotak.bankcode = "NEW KOTAK 005";
        kotak.printDetails();



    }
}
