package ArrayProblem1DBased;
//Q1. Write a program to print the sum of all the elements present on even indices in the given array.
//Input1: arr[]={3,20,4,6,9}; output : 16
//Input2: arr[]={4,3,6,7,1}; output : 11
//
//Q2. Write a program to traverse over the elements of the array using for each loop and print all even elements.
//input: arr[]={34,21,54,65,43}; output : 34 54
//
//Q3. Write a program to calculate the maximum element in the aray.
//input1 : arr[]={34,21,54,65,43}; output : 65
//input2: arr[]={4,3,6,7,1}: output:7
//
//Q4: Write a program to find out the second largest element in a given array.
//input: arr[]={34,21,54,65,43}: output: 54
//input2: arr[]={4,3,6,7,1}; output : 6

//Q5: Given an array. Find the first peak element in the array. A peak element is an element
// that is greater than its just left and just right neighbor.
//input1: arr[]={1,3,2,6,5}; output : 6
//input2: arr[]={14,7,3,2,6,5}; output: 7



public class QuestionBasedOnOneD {
    public static void main(String[] args) {
        System.out.println("Q1");

//        //Q1. Write a program to print the sum of all the elements present on even indices in the given array.
////Input1: arr[]={3,20,4,6,9}; output : 16
////Input2: arr[]={4,3,6,7,1}; output : 11
//        int sum=0;
//       int arr[]={3,20,4,6,9};
//       for(int i=0; i<arr.length; i+=2){
//           System.out.println(arr[i]);
//            sum+=arr[i];
//       }
//        System.out.println("Addition of sum indices = "+sum);
        System.out.println("\n\n Q2");
        //Q2. Write a program to traverse over the elements of the array using for each loop and print all even elements.
//input: arr[]={34,21,54,65,43}; output : 34 54
//        int arr[]={34,21,54,65,43};
//        for (int even:arr){
//            if(even%2==0){
//                System.out.print(even+" ");
//            }
//        }
        System.out.println("\n\n Q3");
//        //Q3. Write a program to calculate the maximum element in the aray.
////input1 : arr[]={34,21,54,65,43}; output : 65
////input2: arr[]={4,3,6,7,1}: output:7
//        int max=0;
//        int arr[]={34,21,54,65,43};
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("Maximum element of this arr is : "+max);
//        //2nd way
//        int max=Integer.MIN_VALUE ;
//        int arr[]={34,21,54,65,43};
//        for(int num:arr){
//             max=Math.max(num, max);
//        }
//  System.out.println("Maximum element of this arr is : "+max );

        System.out.println("\n\n Q4");
//        //Q4: Write a program to find out the second largest element in a given array.
////input: arr[]={34,21,54,65,43}; output: 54
////input2: arr[]={4,3,6,7,1}; output : 6
//
//        //for finding 1st maximum number
//        int max1=Integer.MIN_VALUE;
//        int arr[]={34,21,54,65,43};
//        for(int num:arr){
//            max1=Math.max(num,max1);
//        }
//        System.out.println("First largest number is : "+max1);
//
//        //for finding 2nd maximum number
//        int max2=Integer.MIN_VALUE;
//        for(int num:arr){
//            if(num !=max1){
//                max2=Math.max(num,max2);
//            }
//        }
//        System.out.println("Second largest number is : "+max2);
//
//        //for finding 3rd maximum number
//        int max3=Integer.MIN_VALUE;
//        for(int num:arr){
//            if(num !=max1 & num !=max2){
//                max3=Math.max(num,max3);
//            }
//        }
//        System.out.println("3rd largest number is : "+max3);

        System.out.println("\n\n Q5");
//        //Q5: Given an array. Find the first peak element in the array. A peak element is an element
//// that is greater than its just left and just right neighbor.
////input1: arr[]={1,3,2,6,5}; output : 6
////input2: arr[]={14,7,3,2,6,5}; output: 7
//
//        //for find peak number
//        int peak=0;
//        int arr[]={1,3,2,6,5};
//        for(int i=1;i<arr.length-1;i++){
//            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
//                peak=arr[i];
//              //  break;  //use here break keyword for first peak element
//            }
//        }
//        System.out.println("Peak element is : "+peak);

    }


}

