
class Demo1 implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread Executing");
        try
        {
               Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.println("some problem");
        }
        System.out.println("Child thred task completed");
    }
}
public class MultiThreading7
{
    public static void main(String[] args)
    {
        System.out.println("Main Thread started");
        Demo1 d=new Demo1();
        Thread t1=new Thread(d);
        t1.start();
    }
}
