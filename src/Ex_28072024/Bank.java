package Ex_28072024;

public class Bank {
    String name;
    int balance;

    public static void main(String[] args) {
Bank b1 = new Bank();
Bank b2 = new Bank();

b1.name = "SBI";
b2.balance = 100;

        System.out.println(b1.name);
        System.out.println(b1.balance); //0 -- default value of instance variable
        System.out.println(b2.name); //null -- default value of instance variabl
        System.out.println(b2.balance);
    }
}


