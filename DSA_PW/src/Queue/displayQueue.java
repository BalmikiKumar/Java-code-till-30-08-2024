package Queue;


import java.util.*;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
        System.out.println(q);
        //Print all the elements present in given queue only using add(),remove(),size(),& extra queue

         Queue<Integer> helper=new LinkedList<>();
         while (q.size()>0){
             System.out.print(q.peek()+" ");
              int x=q.poll();
              helper.add(x);

         }


   }
}
