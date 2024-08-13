package Ex_10082024.Polymorphism.OverRiding;

public class Lab01 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        Hound h = new Hound();
        h.bark();

        Dog d1 = new Hound(); //parent reference ca access only Overriden methods of object class, not others
        d1.bark();
        // d1.bark1(); ------ Not possible
    }
}
