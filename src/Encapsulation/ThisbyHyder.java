package Encapsulation;

class student3
{
    private String name;
    private int age;
    student3()
    {
        this("rohit",19);
        System.out.println("Default Constructor is called");
        name="Rohan";
        age=18;
    }
    student3(String name)
    {
        this();
        this.name=name;
        age=19;
    }
    student3(String name,int age)
    {
        this.name=name;
        this.age=age;

    }
    public void Disp()
    {
        System.out.println(name+" "+age);
//        System.out.println(age);
    }
}


public class ThisbyHyder {
    public static void main(String[] args) {
        student3 std1=new student3();
        std1.Disp();

        student3 std2=new student3("Rahul");
        std2.Disp();
    }
}
