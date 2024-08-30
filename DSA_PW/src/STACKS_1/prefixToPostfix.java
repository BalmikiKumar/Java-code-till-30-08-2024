package STACKS_1;

import java.util.Stack;

public class prefixToPostfix {
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<String> val=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch+"");
            }else {
                String v1=val.pop();
                String v2=val.pop();
                //work v1 v2 op
                char op=ch;
                String t=v1+v2+op;
                val.push(t);
            }
        }
        System.out.println("Postfix : "+val.peek());
    }
}
