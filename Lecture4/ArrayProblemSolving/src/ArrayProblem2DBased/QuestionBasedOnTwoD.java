package ArrayProblem2DBased;

//Q1.take m and n  input from the user and m*n integer inputs from user and print the following
//a. number of positive numbers
//b. number of negative numbers
//c. number of even nubers
//d. number of odd numbers
//e. number of 0
//
//input:
//e.g  1    2  -3   4
//     0    0  -4   2
//     1   -1   2   3
//     -4  -5  -7   0
// output : p=7 , n=6, o=7, e=9, 0=3


//Q2.


import java.util.Scanner;

public class QuestionBasedOnTwoD {
    public static void main(String[] args) {
//        System.out.println("Q1"); int p=0 , n=0, o=0, e=0, zero=0;
//                Scanner sc=new Scanner(System.in);
//        System.out.println("Enter row no.");
//        int row=sc.nextInt();
//        System.out.println("Enter column no.");
//        int col=sc.nextInt();
//
//        System.out.println("enter all row and column element");
//
//        //initialize array
//        int arr[][]=new  int[row][col];
//
//        //input array element
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//        //logic for finding required element
//        for(int i=0; i<4; i++){
//            for(int j=0; j<4; j++){
//                if(arr[i][j]>0)
//                    p++;
//                  if (arr[i][j]<0) {
//                    n++;
//                }   if (arr[i][j]==0) {
//                    zero++;
//
//                }  if ((arr[i][j]) %2 ==0) {
//                    e++;
//
//                }   if ((arr[i][j]) %2!=0) {
//                    o++;
//                }
//            }
//        }
//        System.out.println("positive : "+p);
//        System.out.println("negative : "+n);
//        System.out.println("odd      : "+o);
//        System.out.println("even     : "+e);
//        System.out.println("Zero     : "+zero);


//        System.out.println("Q2 Print all element above the 1st diagonal");
//
//        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//        //size of row
//        int r=arr.length;
//        //size of column
//        int c=arr[0].length;
//        for(int i=0; i<r;i++){
//            for(int j=0; j<c; j++){
//                if((i+j) <c-1){
//                    System.out.print(arr[i][j]+" ");
//                }
//
//            }
//            System.out.println();
//        }


//        System.out.println("Q3 Print  1st and 2nd diagonal"); //time complexity: O(n^2),space complexity:O(1)
//
//
//        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//        //size of row
//        int r=arr.length;
//        //size of column
//        int c=arr[0].length;
//        for(int i=0; i<r;i++){
//            for(int j=0; j<c; j++){
//                //logic for primary diagonal elements
//                if((i==j) ){
//                    System.out.print(arr[i][j]+" ");
//                }
//                //logic for secondary diagonal elements
//                else if ((i+j)==c-1) {
//                    System.out.println(arr[i][j]);
//                }
//
//            }
//
//        }

//        System.out.println("Q3 (2nd way) Print  1st and 2nd diagonal"); //time complexity: O(n),space complexity:O(1)
//
//
//        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//        //size of row
//        int r=arr.length;
//        //size of column
//        int c=arr[0].length;
//        for(int i=0; i<r;i++){
//            //logic for primary diagonal
//            System.out.println(arr[i][i]+" ");
//
//            //logic for secondary diagonal and skip mid value
//            if(i !=r-1-i){
//                System.out.println(arr[i][r-1-i]+" ");
//            }
//            }

//        System.out.println("Q4 Print  max element given in the array"); //time complexity: O(n^2),space complexity:O(1)
//
//
//        int arr[][]={{1,2,31},{4,5,6},{7,8,9}};
//        int max=Integer.MIN_VALUE;
//        //size of row
//        int r=arr.length;
//        //size of column
//        int c=arr[0].length;
//        for(int i=0; i<r;i++){
//            for(int j=0; j<c; j++){
//                //logic for find largest element in the array
//               if(arr[i][j]>max){
//                   max=arr[i][j];
//               }
//
//            }
//
//        }
//        System.out.println("Maximum value is : "+max);


        System.out.println("Q3 Print middle row and column"); //time complexity: O(r) if c<r or O(c) if r<c,space complexity:O(1)


        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        //size of row
        int r=arr.length;
        //size of column
        int c=arr[0].length;

        //display of middle column values
        for(int i=0; i<r;i++){
            System.out.print(arr[i][c/2] +" ");
        }
        //display of middle row values
        for(int j=0; j<c; j++){
            if(j==c/2){ //logic for skip middle value because middle value is already printed in the above
                continue;
            }
            System.out.print(arr[c/2][j]+" ");
        }
       // System.out.println(" ");

    }
}
