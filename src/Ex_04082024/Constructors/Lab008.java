package Ex_04082024.Constructors;

import java.util.Scanner;

public class Lab008 extends BankAccount{
    public static void main(String[] args) {
        BankAccount icici = new BankAccount();
        icici.printdetails(); //It will give SBI Details since Default Constructor is called

        BankAccount hdfc = new BankAccount("HDFC", 200);
        hdfc.printdetails(); //Here, the details will be of HDFC as PC is called here

        //BankAccount.printdetails();

        BankAccount pnb = new BankAccount();


    }
}
