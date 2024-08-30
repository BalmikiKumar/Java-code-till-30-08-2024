

import java.util.Scanner;
public class sumOfOddSubtractEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int even=0,odd=0,sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even+=i;
            }
            else{
                odd+=i;
            }
        }
        System.out.println("Additon of even = "+even +"\nAdditon of odd = "+odd +"\nsum of odd - substraction of even :"+(odd-even));


    }
}