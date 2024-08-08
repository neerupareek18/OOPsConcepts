package Ex_04082024.Constructors;

import Ex_28072024.Bank;

public class BankAccount {
    static String name;
    static int balance;
    int pincode;

    BankAccount(){ //Constructors can have any access modifiers
//        name = "SBI";
//        balance = 100;
        printdetails();
    }

    BankAccount(String name, int balance){
        this.name = name;
        this.balance = balance;
        BankAccount.name = name;
        BankAccount.balance = balance;
        BankAccount.printdetails();
    }

    //Constructor does not have nay return type, methods/functions have return type

    static void printdetails(){
        System.out.println(name);
        System.out.println(balance);

//        System.out.println(this.name);
//        System.out.println(this.balance);
    }

}
