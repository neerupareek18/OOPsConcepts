package Ex_04082024.Inheritance.SingleInheritance;

public class TC001 extends BaseTest{
    TC001(){
        System.out.println("This is a DC");
    }

    void TC001(){ //-- Since it has th return type, this will not be considered as Constructor

        startBrowser();
        //Code for TC001
        closeBrowser();
    }
}
