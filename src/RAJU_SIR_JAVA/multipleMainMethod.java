package RAJU_SIR_JAVA;

public class multipleMainMethod {


    public static void main(String[] args) {
        multipleMainClass m = new multipleMainClass();

        System.out.println("Main method is running");
        m.main("Ram");
        m.main(5);
        m.main("Ram", "Shyam");
        m.main("Radha");
        m.main('r');

    }
}


class multipleMainClass
{
    public static void main(int number)
    {
        System.out.println("Main method of number "+number);
    }
    public static void main(char c)
    {
        System.out.println("Main method of Character "+c);
    }
    public static void main(String s)
    {
        System.out.println("Main method of Single string "+s);
    }
    public static void main(String s,String s2)
    {
        System.out.println("Main method of double string "+s  +s2);
    }
}
