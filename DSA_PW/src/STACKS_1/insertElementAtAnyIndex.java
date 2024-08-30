package STACKS_1;

import java.util.Stack;

public class insertElementAtAnyIndex {
    public static void main(String[] args) {
//QUESTION : INSERT 101 AT INDEX 1 FROM LAST
//        Stack<Integer> st=new Stack<>();
//        st.push(1);
//        st.push(5);
//        st.push(6);
//        st.push(2);
//        System.out.println(st);
//        Stack<Integer> st1=new Stack<>();
//        while(st.size()>1){
//            st1.push(st.pop());
//        }
//        st.push(101);
//        while (st1.size()>0){
//            st.push(st1.pop());
//        }
//        System.out.println(st);

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(5);
        st.push(6);
        st.push(2);
        System.out.println("Before :"+st);
        displayReverseRec(st);
        System.out.println("After  :"+st);

        Stack<Integer> temp=new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }

        while (temp.size()>0){

            System.out.println(st.push(temp.pop()));

        }
        System.out.println();
        System.out.println(st);

        System.out.println(st.size());

////Q. store stack element in array
//        int n=st.size();
//        int arr[] =new int[n];
//        for(int i=n-1;i>=0;i--){
//            arr[i]=st.pop();
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }

    }
//    //using recursion reverse stack
//    public static void displayReverseRec(Stack<Integer> st){
//       // st.push(100);
//
//        if (st.size()==0){
//            return;
//        }
//        int top=st.pop();
//        System.out.print( top+" ");
//        displayReverseRec(st);
//        st.push(top);
//    }

    //using recursion obverse stack
    //time and space complexity 0(n)
    public static void displayReverseRec(Stack<Integer> st){
        // st.push(100);

        if (st.size()==0){
            return;
        }
        int top=st.pop();

        displayReverseRec(st);
        System.out.print( top+" ");
        st.push(top);
    }
}
