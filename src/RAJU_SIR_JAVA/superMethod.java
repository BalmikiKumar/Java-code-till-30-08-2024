package RAJU_SIR_JAVA;

class Person
{
    Person(){
        System.out.println("address of super = ");
        System.out.println("Constructor of parent class");
    }
    Person(int x)
    {
        System.out.println("Parametrized parent methhod");
    }

}
class Student extends Person{
    Student()
    {
        super();
        System.out.println("Child class constructor");
    }

}


public class superMethod {
    public static void main(String[] args) {
        Student st=new Student();
        System.out.println("address of sst = "+st);
        System.out.println();

    }
}
