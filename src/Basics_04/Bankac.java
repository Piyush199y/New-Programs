package src.Basics_04;

public class Bankac {
    String bankName;
    String bankcode;

    int balance;

    Bankac(){
        bankName = "SBI";
        bankcode = "SBI001";

    }
    Bankac(String bname, String bcode){
        this.bankName = bname;
        this.bankcode = bcode;
    }
    void printDetails(){
        System.out.println("New bank name = " + this.bankName);
        System.out.println("New bank code = " + this.bankcode);
        System.out.println("New balance = " + this.balance);
    }
}
