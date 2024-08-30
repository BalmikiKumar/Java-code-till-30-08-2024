package STACKS_1;

import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);  //below element
        st.push(12);
        st.push(13); //above element
        System.out.println(st); //for print all element

        //for  print last(top)item
        System.out.println("peek method :"+st.peek());

        st.pop(); //top above element is removed from stacks(13)
        System.out.println(st);
        System.out.println(st.size());

        for(int i=0;i<=st.lastElement();i++);

//for printing below element of stack
        System.out.println("last element is :"+st.lastElement());

//for printing below element of stack
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());



    }
}
