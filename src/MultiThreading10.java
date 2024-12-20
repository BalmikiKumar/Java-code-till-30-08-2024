class Car implements Runnable
{
    public void run()  // you can also checked without synchronized keyword(get illogical output)
    {
        try
        {
            System.out.println(Thread.currentThread().getName() + "Has enter the parking lot ");
            Thread.sleep(2000);
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName() + "Got into Car to drive ");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Started to drive the Car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + "Came back and parked the car");
            }

        }
        catch (Exception e)
        {
            System.out.println("some problem");
        }
    }
}

public class MultiThreading10
{
    public static void main(String[] args)
    {
        Car c=new Car();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
