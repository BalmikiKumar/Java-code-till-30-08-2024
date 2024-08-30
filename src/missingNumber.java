import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        System.out.println("Jai shree ram");

        int [] arr={1,2,3,5,6,8,7,};
        int n=arr.length;

//        sum of total natural number in an array with missing number
        int sumOfToralNumbers=((n+1)*(n+2)/2);

        int sum=0;
//        sum Of total current element present in ana array
        for(int i=0; i<n; i++){
            sum +=arr[i];

        }
        int missingNumber=sumOfToralNumbers-sum;
        System.out.println("missing number is :"+missingNumber);




    }
}
