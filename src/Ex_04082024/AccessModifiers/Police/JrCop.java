package Ex_04082024.AccessModifiers.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop1 c = new Cop1();
        System.out.println(c.guns);
        System.out.println(c.vehicleNo);
        System.out.println(c.name);
        //c.code can't be used as it is private

        c.shoot_public();
        c.shoot2();
        c.shoot_default();

        //c.shoot() is private, so not accessible even in same package different class
    }
}
