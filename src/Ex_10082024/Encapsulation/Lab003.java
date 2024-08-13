package Ex_10082024.Encapsulation;

public class Lab003 {
    public static void main(String[] args) {
        Lab004 l = new Lab004("neeru","password");
//        System.out.println(l.password); //it is not dirrectly accessible
//        l.password = "Paa"; //this is not allowed

        System.out.println(l.getPassword());
        //Code to set isAuth true/false

        System.out.println(l.getUsername(true));
        System.out.println(l.getClass());

        l.setUsername("Neeru123");
        l.setPassword("Password123",false);

        System.out.println(l.getPassword());
        System.out.println(l.getUsername(true));

        //Now, the setting of the password hsould not be allowed even using setter method, so we can add isAuth argument int he method
// Data member access is controlled by these methods (getter/setter)

        //If in the future, we don't want to set the data members at all, remove the getter, setter in this case

    }
}

//Ideally, we should not allow any data members to be public so that it won't be directly available to th outside world
//These can be accessed using the function -- getter, setter
class Lab004{
    private String username;
    private String password;

    //Bundling the data and methods in single unit
    //private data members can't be get or set the values using reference
    //These values are wrapped by the getter, setter
    //maintain the security, to have the data members read only, write only

    Lab004(String un, String p){
        this.username=un;
        this.password=p;
    }
//We can also secure the getters
    public String getUsername(boolean isAuth) {
        if(isAuth){return username;}
        else return null;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth){
        this.password = password;}
    }
}
