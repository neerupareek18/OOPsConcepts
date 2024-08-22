package Ex_17082024.staticBlocks;

public class Lab06 {
}

class APIAutomation{
    static{
        System.out.println("Loaded data from MySQL");
    }
    {
        System.out.println("Load the data from CSV File");
    }
}
