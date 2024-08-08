package Ex_04082024.AccessModifiers.Thief;

import Ex_04082024.AccessModifiers.Police.Cop1;

public class Thief1 {
    public static void main(String[] args) {
        Cop1 c = new Cop1();
        // System.out.println(c.guns); //not accessible - default
        c.shoot_public();
    }
}
