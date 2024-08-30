package STACKS_1;

import java.util.Stack;

public class infixEvaluation {
    public static void main(String[] args) {
        String str="-9/*+5346";
        System.out.println(str);
        Stack<Integer> val=new Stack<>();
        for(int i=str.length()-1; i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=58){
                val.push(ascii-48);
            }
            else {
                int v1=val.pop();
                int v2=val.pop();
                //work
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println("Evaluated value : "+val.peek());


    }
}
