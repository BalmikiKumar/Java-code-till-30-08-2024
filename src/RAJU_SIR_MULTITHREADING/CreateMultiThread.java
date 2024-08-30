package RAJU_SIR_MULTITHREADING;

import java.util.Scanner;

class MyThread1 extends Thread{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number : ");
        int a=sc.nextInt();
        System.out.println("Enter Second number : ");
        int b=sc.nextInt();
        System.out.println("Addition of two number is : "+(a+b));
        System.out.println("Calculation ended...........");
        System.out.println();
    }

}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0; i<3;i++){
            System.out.println("2nd thread is running.......");
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                System.out.println("wait for 4 second");
            }
        }

    }

}
public class CreateMultiThread {
    public static void main(String[] args) {
        System.out.println("Main Thread started!");
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();


        t2.start();
        t1.start();
    }
}
