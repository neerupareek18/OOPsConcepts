package Ex_18082024.ExceptionHandling.thowKeyword;

public class Bank {

    private String currency;

    public Bank(int balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(Bank bankname){
        if(!bankname.currency.equalsIgnoreCase("INR")){
            try {
                throw new Exception("Currency mismatch error"); //Custom Exception
                //System.out.println("Currency mismatch");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return this.balance+bankname.balance;
    }



}
