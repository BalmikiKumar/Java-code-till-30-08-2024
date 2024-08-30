import java.util.Scanner;
public class raisepower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first and Second value :");
        int a=sc.nextInt(),b= sc.nextInt();
        int ans=1;
        for(int i=1; i<=b;i++)
        {
            ans=ans*a;
        }
        System.out.println(ans);


        //for reversing number
        int rev=0;
        while(ans>0){
            rev=rev*10+ans%10;
            ans/=10;
        }
        System.out.println("Reverse no : "+rev);
    }
}


//import java.util.Scanner;
//
//class raisepower{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter first number :");
//        int n= sc.nextInt();
//        System.out.println("Enter second number :");
//        int p= sc.nextInt();
//        System.out.println("Answer ="+n*p);
//    }
//}