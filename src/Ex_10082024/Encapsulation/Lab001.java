package Ex_10082024.Encapsulation;

public class Lab001 {
    public static void main(String[] args) {
        Lab002 l = new Lab002("neeru","password");
        System.out.println(l.password);
        l.password="pass";
        System.out.println(l.password); //password can be changed anytime in case of public

    }
}
//There can be only one public class in one program but can have any number of classes

class Lab002{
    public String username;
    public String password;

    Lab002(String un, String p){
        this.username=un;
        this.password=p;
    }
}
