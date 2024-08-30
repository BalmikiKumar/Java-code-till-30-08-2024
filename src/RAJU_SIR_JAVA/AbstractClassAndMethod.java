package RAJU_SIR_JAVA;

abstract class abstractClass{
    int var;
    abstract void method1();
    abstract void method2();
    abstract void method3();
    abstract void method4();

}

class child extends abstractClass{
    public void method1(){
        System.out.println("Inherited(in child class) method from abstract class");
    }
    public void method2(){

    }
    public void method3()
    {

    }
    public void method4()
    {

    }
}
public class AbstractClassAndMethod {
    public static void main(String args[]){
    child c=new child();
    c.method1();


    }
}
