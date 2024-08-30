package OneD_2d_array;
//Approach modified binary search
import java.util.Scanner;

public class square_root {
    //function definition
    public static int findSquareRoot(int num){  //tc=0(log n), sc=0(1)
        int low=0,high=num,result=-1;
        //modified binary search
        while (low <= high){
            int mid=low + (high - low)/2;
            long val = mid * mid;

            if(val == num){
                //perfect square root
                return mid;
            }
            else if(val < num){
                //store the floor value, incase the number is not perfect square root, we can print the floor value
                result = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root :");
        int num=sc.nextInt();

        //Function calling
        int result=findSquareRoot(num);
        System.out.println("Square root of the given number is : "+result);
    }
}
