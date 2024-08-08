package Ex_04082024.Inheritance.SingleInheritance;

import Ex_04082024.Inheritance.MutiLevelInheritance.GrandBaseTest;

public class BaseTest extends GrandBaseTest {
    void startBrowser(){
        dataFromSQL(); //Protected can be used in different package subclass, default can't be used
        // dataFromExcel(); //Not Possible
        System.out.println("Start the Browser");
    }

    void closeBrowser(){
        System.out.println("Close the Browser");
    }
}
