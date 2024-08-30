import java.util.Random;
import java.util.Scanner;

class Parent
{
    void multi()
    {
        System.out.println("This block is Parent block");
    }
}
class child1 extends Parent
{

}
class child2 extends Parent
{

}
class child3 extends Parent
{
    void multi()
    {
        System.out.println("This block is Parent block but this is overiding block because i'm make some changing in this block");
    }
    void specilized()
    {
        System.out.println("This is specialized block because This class is have done extends Parent class and write a extra method this is specilized");
    }


}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        child3 c1=new child3();
        c1.multi();
        c1.specilized();

    }

}

