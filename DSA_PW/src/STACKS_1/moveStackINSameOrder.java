package STACKS_1;

import java.util.Scanner;
import java.util.Stack;

import java.util.Stack;

public class moveStackINSameOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();

        int n;
        System.out.println("Enter the number of elements you wants to insert :");
        n=sc.nextInt();
        System.out.println("Enter "+n +"elements :");
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

   //for copy stack element in another stack in reverse order
        Stack<Integer> rst=new Stack<>();
        while (st.size()>0){
            int x=st.peek();
            rst.push(x);
            st.pop();
        }
        System.out.println("Reversed element in another stack :"+rst);


        //QUESTIONS
        //1. copy contents of one stack to another in same order
        Stack<Integer> finalStack=new Stack<>();
        while (rst.size()>0){
            finalStack.push(rst.pop());
        }
        System.out.println(finalStack);
        System.out.println(rst);
        System.out.println(st);
    }
}
