//Q. MULTITHREADING KO ACHIEVE KARE SINGLE RUN() METHOD KO USE KARKE YANI MULTIPLE KO KAISE ACHIEVE KIYA JATA HAI USING SINGLE RUN METHOD

import java.util.*;
class MyThread1 extends Thread{
    public void run()
    {
        String tName=Thread.currentThread().getName();
        if (tName.equals("CALC"))
        {
            calc();
        }
        else
        {
            importantMessage();
        }
    }
    public void calc()
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
    public void importantMessage()
    {
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


public class MultiThreading6 {
    public static void main(String[] args)
    {
        System.out.println("Main Thread is started");
        MyThread1 thread1=new MyThread1();
        MyThread1 thread2=new MyThread1();
        thread1.setName("CALC");
        thread2.setName("PRINT");
        thread1.start();
        thread2.start();
    }
}
