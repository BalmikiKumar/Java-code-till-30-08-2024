/*
public class addtwonumber {
    public static void main(String[] args)
    {
        int a=10, b=20;
        System.out.println("sum = " + (a+b));
    }


}
*/

import java.util.Scanner;
class Subtraction
{
    int Sub(int a, int b)
    {
        int result = a-b;
        return result;
    }
}


class Add
{
    public static void main(String args[])
    {
        Subtraction obj=new Subtraction();
        int result=obj.Sub(20,5);
        System.out.println(result);

//        int a,b,sum;
//        System.out.print("Enter two numbers :");
//
//        Scanner r=new Scanner(System.in);
//        a=r.nextInt();
//        b=r.nextInt();
//
//        sum = a + b;
//        System.out.print("ADDITION =" + sum);


    }


}



