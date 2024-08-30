package Queue.QueueQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseAQueue {
    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        System.out.println(q);
//
//        Stack<Integer> st=new Stack<>();
//        while (q.size()>0){
//            st.push(q.remove());
//        }
//        while (st.size()>0){
//            q.add(st.pop());
//        }
//        System.out.println(q);


        //REVERSE Kth ELEMENT OF A QUEUE
    //QUESTION : reverse first 3 element of a queue
         //input:1,2,3,4,5
        //output:3,2,1,4,5
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<3;i++){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }

        for(int i=0;i<2;i++){
            q.add(q.poll());
        }
        System.out.println(q);
    }
}
