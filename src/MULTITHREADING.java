import java.util.*;
class Calcc extends Thread{
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
class Message extends Thread{
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

public class MULTITHREADING {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Calcc t1=new Calcc();
        Message t2=new Message();
        t1.start();
        t2.start();

    }
}
