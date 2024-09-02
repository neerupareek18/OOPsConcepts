package Ex_24082024.CollectionFramework.overridetoString;

public class Lab01 {
    public static void main(String[] args) {
        Person p1 = new Person("Neeru", "Jaipur");
        Person p2 = new Person("Nehal", "Bangalore");

        System.out.println(p1);

    }
}

class Person{
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name+"="+this.address;
        //return super.toString();
    }
}
