package src.Throw_Throws;

public class bank3 {

    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public bank3(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add(bank3 bankName) throws CustomException {
        if (!(bankName.currency.equalsIgnoreCase("INR"))){
            throw new CustomException("USD to INR not allowed");
        }
        Integer sum = this.amount + bankName.amount;
        return sum;


    }
}
