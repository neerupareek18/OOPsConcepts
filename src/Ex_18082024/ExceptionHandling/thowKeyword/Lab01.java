package Ex_18082024.ExceptionHandling.thowKeyword;

public class Lab01 {
    public static void main(String[] args) {
        Bank sbi = new Bank(100, "INR");
        Bank icici = new Bank(20, "INR");

        System.out.println(sbi.add(icici));

        Bank jpmorgan = new Bank(90, "USD");
        System.out.println(sbi.add(jpmorgan));

    }
}
