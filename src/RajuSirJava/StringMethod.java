package RajuSirJava;

public class StringMethod {
    public static void main(String[] args) {

        String s4="we like";
        String s5="we "+"like";
        System.out.println(s4==s5);

        String s6="we";
        String s7=s6+" like";
        System.out.println(s5==s7);





        //length() method
        String str="hello";

        System.out.println(str.length());

        //charAt(int index)
        //1st rule
        char result=str.charAt(0);
        System.out.println(result);
        //2nd rule
        System.out.println(str.charAt(1));

   //todo     //getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)
        String str2="Hello Balmiki";
        char [] resultt=new char[9];
        str2.getChars(3,10,resultt,0);
        System.out.println(resultt);

        //equals(object obj) :- it check context of reference object
        String str10="hello";
        System.out.println(str.equals(str10)); //true

        //compareTo(String str) :- it compare the current string object with another string (difference of length),it returns integer value
        String str11="hello balmiki";
        int resulttt=str.compareTo(str11);
        System.out.println(resulttt);  //  -8

        //startsWith(String prefix), it tests whether aa string starts with the specified prefix or not . it return boolean value
        System.out.println(str.startsWith("s")); //false

        //endsWith(String suffix), it tests from last char is same or not
        System.out.println(str.endsWith("o")); //true

        //indexOf(int ch) , it return index value of first match character from beigning
        System.out.println(str.indexOf('l'));

        //lastIndexOf(int ch), it return index value of last match character
        System.out.println(str.lastIndexOf('l'));

        //subString(int beging inddex),it print between value
        System.out.println(str.substring(2));
        System.out.println(str.substring(0,3));

        //concat(String str)
        System.out.println(str.concat(str11));

        //replace(char oldChar, char newChar)
        System.out.println(str.replace('l','B'));

        //toUpperCase() ,Converts the string to uppercase and returns it.
        System.out.println(str.toUpperCase());

        //toLowerCase(), Converts the string into lowercase and returns it.
        String str3="RAJA";
        System.out.println(str3.toLowerCase());

        //trim(),it Removes white space from both ends of a string object and returns the trimmed string.
        String str4="       balmiki";
        System.out.println(str4.trim());

        //toCharArray(),
        String str5="welcome to java";
        System.out.println(str5.length());
        char ch[]=str5.toCharArray();
        System.out.println(ch);

        //split() two or more words
        String st="Balmiki kumar";
        String st1="";
        String st2[]=st.split(" ");
       // System.out.println(st2[0]);
        for(int i=st2.length-1; i>=0; i--){
            st1=st1+st2[i];

        }
        System.out.println(st1);

        //valueOf(Object obj)
        int a=10,b=20;
        char []c={'a','b'};
        System.out.println(c[0]);
        System.out.println(String.valueOf(a));

        //equalsIgnoreCase()
        String st3="java";
        String st4="Java";
        System.out.println(st3.equalsIgnoreCase(st4));

//append(String obj)
        StringBuilder st5=new StringBuilder("Ram");
        st5.append(" Sita ABCDEF");
        System.out.println(st5);


        //delete()
        System.out.println(st5.delete(10,14));
        System.out.println(st5.deleteCharAt(2));
        System.out.println(st5.indexOf("a"));

        //insert()
        StringBuilder st6=new StringBuilder("Balmiki");
        System.out.println(st6.insert(7," kumar"));


        //reverse()
        //1st rule
        System.out.println(st6.reverse());

        //2nd rule
        String st8="Balmiki kumaR";
        String st9="";
        for(int i=st8.length()-1;i>=0;i--){
            st9=st9+st8.charAt(i);
        }
        System.out.println(st9);

//

    }

}
