import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


public class FailFast_And_FailFast {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(40);
        System.out.println(al); // [10, 20, 30, 40, 40]

        // by for loop print data and try to add some data at run time it means concurrent modification
//        for(int i=0; i<al.size();i++)
//        {
//            System.out.println(al.get(i));
//            al.add(50);    // is line ke wajah se collection ka size har ek iterator me +1 se badhata chala jayega
//                          // aur loop infinite ho jayega isliye loop ka use nahi karte hai
//        }

//        //FailFast
//        Iterator itr=al.iterator();
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());  // 10 20 30 40 40 print ho jayega in verically
//            al.add(60);  // Agar is line ka use karenge to kewal 10 print karke ConcurrentModificationException aa jayega
//        }

        //FailSafe ke liye new ArryList
        CopyOnWriteArrayList al1=new CopyOnWriteArrayList();
        al1.add(10);
        al1.add(20);al1.add(30);
        al1.add(30);

        System.out.println(al1);    //    [10, 20, 30, 30]

        Iterator itr1=al1.iterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());  // print karega 10 20 30 30 in veertically
            al1.add(40);           // print safely karega without exception 10 20 30 30 in veertically

        }

    }
}
