package Ex_11082024.Abstraction.usingInterface;

public class ImplementingClass implements Car{
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}

interface I{}
class A{}
class B{}
abstract class C{}
class Test1 extends A{}
class Test2 extends B{}
class Test0 implements I{}
interface I2{}
class Test3 implements I,I2{}
class Test5 extends Test3 implements I, I2{}
interface I3 extends I{}
//Not Possible --
//class Test6 implements I2 extends Test3{}
//interface I2 extends A{}
//interface I2 implements A{}


