package src.Basics_04;

public class Bankac {
    String bankName;
    int balance;

    Bankac(){
        bankName = "SBI";
    }
    Bankac(String bname){
        this.bankName = bname;
    }
    void printDetails(){
        System.out.println("New bank name = " + bankName);
        System.out.println("New balance = " + balance);
    }
}
