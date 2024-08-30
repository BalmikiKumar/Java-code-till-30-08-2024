//order of insertion not preserved
//Duplicate value allow
//it store only homogeneous data(integer type of data not float,char,string)
//its follow mean-heap rule for data storing it means follow CBT(complete binary tree)
//add data in rear end(last me)
//index based not allow
//child node ka data(value) parent node ke data(value) se jyada hota hai
//parent node ka data(value) dono child ke data(value) se kam hota hai
//null value is not allow
//mix type of data add karne par ClassCastException aata hai run time

import java.util.*;
public class PriorityQueueStudy {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();  //use Comparator.reverseOrder() for reverse order
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
     //   pq.add("string");    //ClassCastException
        System.out.println(pq);   //     [25, 50, 125, 100, 75, 150, 175]
    }
}
