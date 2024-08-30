 package STACKS_1;
 import java.util.SimpleTimeZone;
 import java.util.Stack;
//public class prefixToInfix {
//    public static void main(String[] args) {
//       String str="-9/*+5346";
//
//
//            Stack<String> val=new Stack<>();
//            for(int i=str.length()-1;i>=0;i--){
//                char ch=str.charAt(i);
//                int ascii=(int)ch;
//                if(ascii>=48 && ascii<=57 ){
//                    val.push(ch+"");
//                }
//
//                else{
//                    String v1=val.pop();
//                    String v2=val.pop();
//                    char op=ch;
//                    // work v1 op v2 with parenthesis
//                    String t="("+v1+op+v2+")";
//                    val.push(t);
//                }
//            }
//
//            System.out.println("Infix : "+val.peek());
//
//    }
//}
////(9-(((5+3)*4)/6))

public class prefixToInfix {
    public static void main(String[] args) {
        //String str="-9/*+5346"; //infix
        String str="ab+cd%e-*f/"; //postfix
        Stack<String> st=new Stack<>();

         for (int i=0;i<str.length();i++){  //for postfix to infix
     //   for(int i=str.length()-1;i>=0;i--){  // for prefix to infix
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=97 && ascii<=122){
                st.push(ch+"");
            }
            else{
                String v1=st.pop();
                String v2=st.pop();
                char o=ch;
                //work
                String s='('+v1+o+v2+')';
                st.push(s);
            }
        }

         String p=st.peek();
        System.out.println(p);

    }

}