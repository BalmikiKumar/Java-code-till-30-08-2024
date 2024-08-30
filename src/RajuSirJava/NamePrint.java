package RajuSirJava;

import java.util.Scanner;

class MyNameThread implements Runnable
{
    public synchronized void run(){
        try{
            System.out.println("Enter your name : ");
            Scanner scanner=new Scanner(System.in);
            String name=scanner.next();
            for(int i=0;i<name.length();i++)
            {
                System.out.println(name.charAt(i));
                Thread.sleep(1000);
            }

        }
        catch (Exception e)
        {
            System.out.println("Some Problem");
        }
        System.out.println("Work Finished !");
    }
}
public class NamePrint {
    public static void main(String[] args) {

        MyNameThread mnt=new MyNameThread();
        Thread t=new Thread(mnt);
        t.start();


    }
}
