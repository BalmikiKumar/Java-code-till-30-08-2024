package OneD_2d_array;

import java.util.Scanner;

public class lowerBond {
    //function definition
    public static int FirstFindOccurence(int arr[],int target){   //tc=0(log n), sc=0(1)
        int low=0,high=arr.length-1;
        int result=-1;
        while (low<=high){
            //to avoid overflow
            int mid=low + (high - low)/2;
            if(arr[mid] == target){
                result = mid;
                //traverse to the left side of an array
                high = mid - 1;
            }
            else if(arr[mid] > target){
            }
            else{
                low = mid + 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in an array");
        int n=sc.nextInt();
        System.out.println("Enter array elements : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target element : ");
        int target=sc.nextInt();
        System.out.println("");

        //function calling
        int result=FirstFindOccurence(arr,target);
        if(result == -1) System.out.println("Element not found");
        else System.out.println("Element found at index : "+result);
    }
}
