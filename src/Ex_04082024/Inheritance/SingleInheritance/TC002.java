package Ex_04082024.Inheritance.SingleInheritance;

public class TC002 {
    void TC002(){

        //If extends is not used, then we can call like this
        new BaseTest().startBrowser();
        new BaseTest().closeBrowser();

        BaseTest b = new BaseTest();
        b.startBrowser();
    }

    public static void main(String[] args) {
        new TC002().TC002();
    }
}
