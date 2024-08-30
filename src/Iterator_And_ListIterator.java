//loop ke sahare data print karna data accessing kahlata hai , direct  print karna data fetching kahlata hai
//Iterator ka concept collection ka sabhi classes me hota hai
//koi bhi loop ke madhyam se data ko fetch karte hai to dhyan dena padta hai ki us class ya interface
//     me index based inssertion hai ya nahi,nahi rahne par data fetch nahi hoga waha Iterator ke concept lagta hai
//Note :  ListIterator kewal Listbased iterator me hi hai Setbased, Queue based, Deque based me nahi
//Note : Setbased,Queue ,Deque ke data ko iterate karne ke liye pahle use listbased class (ArrayList,LinkedList) me add
//        kar le uske baad iterator ke function use kar sakte hai

import java.util.*;
public class Iterator_And_ListIterator {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(30);
        System.out.println(al);   //   [10, 20, 30, 30]
//
//        for(int i=0; i<=al.size(); i++)
//        {
//            //1st way to print data
//            Object o=al.get(i);
//            System.out.println(o);

//            //2nd way to print data
//            System.out.println(al.get(i));
//        }
        System.out.println("*********************************");
        //print data by for each loop
//        for(Object o:al)
//        {
//            System.out.println(o);
//        }

        //PRINT DATA BY ITERATOR
//        Iterator itr=al.iterator();
//        while (itr.hasNext())
//        {
//            // 1st way to print data
//           // System.out.println(itr.next());
//
//       // 2nd way to print data
//            Integer i=(Integer) itr.next(); // in itr data is store as a object so we have to need to downcast here
//            System.out.println(i);
//        }

        // FOR REVERSE PRINTING THRU ITERATOR
        ListIterator litr=al.listIterator(al.size());
        while (litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }


    }
}
