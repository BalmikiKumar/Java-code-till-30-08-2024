//
//class ClassA
//{
//    private int value;
//    ClassA(int value)
//    {
//        this.value=value;
//    }
//
//    public void ClassAMethod()
//    {
//        System.out.println("This is the method of classA and value is :"+value);
//    }
//
//}
//
//class ClassB
//{
//    private String text;
//
//    public ClassB(String text)
//    {
//        this.text=text;
//    }
//    public void ClasBMethod()
//    {
//        System.out.println("This is the method of classB and string : "+text);
//    }
//
//}

import java.util.Scanner;

class Computer
{
    int cost;
    Computer(int val)
    {

        this.cost=val;
        System.out.println("This is constructor of Computer class and value is "+cost);
    }
    public void method_Computer()
    {
        System.out.println("This is method of Computer class");
    }
}

class Laptop
{
    String cost;
    Laptop(String val)
    {this.cost=val;

        System.out.println("This is constructor of Laptop class and value is :"+cost);
    }
    public void method_Laptop()
    {
        System.out.println("This is method of Laptop class");
    }
}
public class raju {

    public static void main(String[] args) {

        System.out.print("hello");
        System.out.println(" and world in the same line");
        System.out.println();

        Computer c=new Computer(55);
      //  c.method_Computer();

        Laptop l  =new Laptop("Radhe Radhe");
        l.method_Laptop();


//        ClassA a = new ClassA(45);
//        a.ClassAMethod();
//
//        ClassB b=new ClassB("hw");
//        b.ClasBMethod();


    }
}
