package Ex_17082024.enums;

public enum Color {
    Red("#0f000"),
    White("#008I7");
    //First define the enums names, values -- after that only write the variables, constructor, etc
    String color_value;

    Color(String color_value){
       this.color_value=color_value;
    }

    String get_value(){
        return this.color_value;
    }
    void m1(){
        System.out.println("This is a m1 method");
    }
}
