package Encapsulation;
class Nagrik {
    private int age;
    private String name;

    Nagrik()
    {
        name = "Balmiki";
        age = 19;
    }

        Nagrik(int age)
    {

        name="Roushan";
        this.age=age;

    }
    Nagrik(String name)
    {
        this(191);
        this.name=name;
        age=25;
    }
    Nagrik(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void Disp() {
        System.out.println("Nagrik Age = " + age + " Nagrik name = " + name);

//    static void  first()
//        {
//            System.out.println("This block is first execute because this is static block");
//        }
    }
}

public class Thismethod {
    public static void main(String[] args) {
        System.out.println("Jai Shree Ram");
//        Nagrik obj=new Nagrik();
//        obj.Disp();
        Nagrik obj1=new Nagrik("Babli");
        obj1.Disp();
    }
}
