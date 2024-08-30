package STACKS_1;

import java.util.Stack;

public class underflow_overflow {
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        //if stack is empty and we are trying to do pop() , peek() operation then occur underflow exception
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();

        //if stack is full and we are trying to do  push() operation then occur overflow exception

    }
}
