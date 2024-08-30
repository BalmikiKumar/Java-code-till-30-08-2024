package Encapsulation;
class Gunjan
{
    int age;
    private String name;

    public void setAge(int age,String name)
    {
        age=age;
        this.name=name;
    }

    public void show()
    {
        System.out.println("YOUR NAME :"+name +"  YOUR AGE :"+age);
    }
}



public class Employee {
    public static void main(String[] args) {
        System.out.println("jai shree ram");
        Gunjan std=new Gunjan();
        std.setAge(3,"Gunjan kumar yadav");
        std.show();


    }
}
