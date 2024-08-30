package RAJU_SIR_MULTITHREADING;

class MyThreads extends Thread{
    public void run(){
        System.out.println("Run child thread");
    }


}

public class MultiThreadingFirst {
    public static void main(String[] args) {
        System.out.println("Main method ");

//HOW TO KNOW DEFAULT THREAD NAME AND PRIORITY
//        System.out.println("Before changing Thread name and priority........");
//        String name=Thread.currentThread().getName();
//        int priority=Thread.currentThread().getPriority();
//        System.out.println("Name of Thread is : "+name);
//        System.out.println("Priority of Threa is :"+priority);
//
//CHANGE THREAD NAME AND PRIORITY
//        System.out.println("After changing Thread name and priority......");
//        Thread t1=Thread.currentThread();
//        t1.setName("own thread");
//        t1.setPriority(1);
//        System.out.println("New Thread name : "+Thread.currentThread().getName());
//        System.out.println("New Thread P :"+Thread.currentThread().getPriority());



 MyThreads t=new MyThreads();
 t.start();

    }
}
