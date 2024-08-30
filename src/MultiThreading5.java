import java.util.*;
class Calcc2 implements Runnable{
    public void run()
    {
        System.out.println("Calculation task started :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter first number :");
        int num1=sc.nextInt();
        System.out.println("Plz enter 2nd number :");
        int num2= sc.nextInt();
        int result =num1+num2;
        System.out.println(result);
        System.out.println("Calculation task ended :");
        System.out.println("*******************************************");
    }
}
class Message2 implements Runnable{
    public void run(){
        System.out.println("Displaying  important message task :");
        try
        {
            for(int i=0; i<3; i++)
            {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        }
        catch (Exception e)
        {
            System.out.println("Some Problem");
        }
        System.out.println("Displaying important message task ended");
    }
}


public class MultiThreading5 {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Calcc2 c2=new Calcc2();
        Message2 m2=new Message2();

        Thread t1=new Thread(c2);
        Thread t2=new Thread(m2);

        t1.start();
        t2.start();

    }
}
