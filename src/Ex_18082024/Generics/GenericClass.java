package Ex_18082024.Generics;

public class GenericClass {
    public static void main(String[] args) {
        Test <Integer> t= new Test(5);
        System.out.println(t.getObj());

        Test <String> t1 = new Test ("String");
        System.out.println(t.getObj());
    }

}

class Test <T>{
    T obj;
    Test(T obj){
        this.obj =obj;
    }
    public T getObj() {
        return this.obj;
    }
}
