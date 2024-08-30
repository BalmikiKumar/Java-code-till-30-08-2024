import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value :");
        int a = sc.nextInt();
        System.out.println("Enter second value :");
        int b =sc.nextInt();
        int ans=a+b;
//        int original_n = n;
//        while(n>0){
//            sumOfDigits +=n%10;
//            n=n/10;

        System.out.println("sum of digits in "+ans);
    }
}
