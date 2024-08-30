import java.util.Comparator;
import java.util.PriorityQueue;

public class Missing_element {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,14,8};

        int m=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==4) m=arr[i];
        }
        if(m==4) System.out.println("not missing");
        else System.out.println("4 is missing");

//        //check 4 is present or not
//
//        for(int i=0;i<arr.length;i++){
//          //  System.out.println(arr[i]);
//            if(arr[i]==6){
//                System.out.println("p");
//                break;
//            }
//            else {
//                System.out.println("np");
//
//            }
//        }



  //2nd way if the element is related to nature number
        //sum of array elements that should be
        int sumArray=0; int l=arr.length+1;
        for(int i=1; i<=l ;i++){
            sumArray+=i;
        }

        //sum of array elements that is present
        int sump=0;
        for(int i=0;i<arr.length;i++){
            sump +=arr[i];
        }

        //missing element
        System.out.println("missing element is :"+(sumArray-sump));
    }
}
