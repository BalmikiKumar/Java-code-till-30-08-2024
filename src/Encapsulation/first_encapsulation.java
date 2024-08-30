package Encapsulation;

class Student
{
    int age;
    String name;
    public void setData1()
    {
        age=12;name="Bharat";

    }

    public  void setData2()
    {
        age=15;
        name="shatrudhan";
    }
    public void show()
    {
        System.out.println(age+ " "+name);
    }
}
public class first_encapsulation {
    public static void main(String[] args) {
        System.out.println("Shree ram");

        Student obj=new Student();
//        Student obj1=new Student();


        obj.setData2();
        obj.show();
        obj.setData1();
        obj.show();

//        obj.setData1();
//        obj.show();
//        obj1.show();
//
//        obj1.setData2();
//        obj1.show();
//        obj1.show();

    }
}
