package Ex_28072024;

public class Lab002 {
    public static void main(String[] args) {
        //String args; -- can't be used as we are using in the paranthesis
        System.out.println("Hell World");
        //System is the clss, call println method using out reference
        //out is a PrintStream

        //args -- 3 dots at the right top, Program Arguments - OK
//Given Neeru Pareek
        System.out.println(args[0]);
        System.out.println(args[1]);
       // System.out.println(args[2]); -- Out of bound Error

    }
}
