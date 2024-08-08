package Ex_04082024.Constructors;

class Lab007 {
    public static void main(String[] args) {
        //if we need to assign the value of the variables while creating the Object
        ATBPerson p1 = new ATBPerson("Aman");
        //We need Parameterized constructor

        ATBPerson p2 = new ATBPerson("Neeru");
        //When Parameterised constructor is called, DC will not be called

        new ATBPerson("Neeru",20);

        System.out.println(p1.name);
    }


}
