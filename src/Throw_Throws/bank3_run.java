package src.Throw_Throws;

public class bank3_run {
    public static void main(String[] args) throws CustomException {
        bank3 chase = new bank3("USD", 100);
        bank3 hdfc = new bank3("INR", 100);
        bank3 icici = new bank3("INR", 100);

        System.out.println(hdfc.add(chase));  // wrong - should throw an error
        System.out.println(hdfc.add(icici));
    }
}
