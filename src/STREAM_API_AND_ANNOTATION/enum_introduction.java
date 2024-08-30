package STREAM_API_AND_ANNOTATION;
//NOTE :- enum is a keyword , enum can be create inside the main class or outside the main class
//NOTE :- enum is also a template like class
//NOTE :- We can't create object of enum
//NOTE :- enum data is bydefault public static and final(constant)
//NOTE :- within the enum we can also create normal variable , method and constructor
//NOTE :- we can also use the functiionality of switch statement within enum

//import java.lang.*;
enum Result{
    PASS,FAIL,NOT_RESULT;  //here not required to specify data type and accessifier
}

enum Week{
    SUN,MON,TUE,WED,THU,FRI,SAT;

}
public class enum_introduction {
    public static void main(String[] args) {
        Result res=Result.PASS;
        Result res1=Result.FAIL;

        System.out.println("Result = "+res);
        System.out.println(res1);

        int w=Week.FRI.ordinal();  //FOR FETCHING INDEX VALUE
        System.out.println("Indes value of FRI = "+w);

        //FOR FETCHING ALL DAY AND ITS CORRESPONDING INDEX
     Week arr[]=Week.values();
     for(Week di:arr){
         System.out.println(di+" : "+di.ordinal());
     }

    }
}
