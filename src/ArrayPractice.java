
import java.util.Scanner;



public class ArrayPractice {



    public static void main(String[] args) {
        System.out.println("Jai Shree Ram");

        double var=0;
        Math math = null;
        System.out.println(math.pow(5,2));
for(int i=1;i<=3;i++){
    if(i==3)
        continue;
    var=var+(math.pow(i,2));
}System.out.println("r :"+var);




//        // FIND MISSING NUMBER
//
//        int [] element ={1,3,7,4,5,6,8,9};
//        int n= element.length;
//        System.out.println(n);
//        // TOTAL SUM FROM FIRST TO LAST
//        int t_sum=((n+1)*(n+2))/2;
//        System.out.println(t_sum);
//
//        // TOTAL SUM THAT IS PRESENT IN THIS AN ARRAY
//        int p_sum=0;
//        for(int i=0; i<n; i++){
//            p_sum +=element[i];
//        }
//        // MISSING ELEMENT
//        int result=t_sum - p_sum;
//        System.out.println(result);



















//
//         //   2-D ARRAY FROM SELF INPUT AND ADD ALL ELEMENT AND PRINT MATRIX
//
//        int sum=0;
//        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
//        int n= arr.length;
//        for (int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                sum +=arr[i][j];
//                System.out.print(arr[i][j] +"  ");
//            }
//            System.out.println();
//        }
//        System.out.println(sum);













//   1-D ARRAY FROM USER INPUT AND ADD
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of size an array :");
//        int n=sc.nextInt();
//
//        System.out.println("Enter element of an array :");
//        int arr[]=new int[n];
//        int sum=0;
//        for(int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//            sum +=arr[i];
//
//        }System.out.println("your enter elements are "+ n +"and add = "+ sum);


//      //   A-D ARRAY FROM SELF INPUT AND ADD

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no of size :");
//
//        int m= sc.nextInt();
//
//        System.out.println("Enter elements of array :");
//        int a[] =new int[m];
//        int sum=0;
//
//        for(int i=0; i<m; i++){
//            a[i]= sc.nextInt();
//            sum +=a[i];
//        }
//        System.out.println(sum);

//        int sum=0;
//        int a[]={1,2,3,4,5};
//        int n= a.length;
//        for(int i=0; i<n; i++){
//            sum+=a[i];
//            System.out.print(a[i] +" ");
//        }
//        System.out.println();
//        System.out.println(sum);


//
//        //PRINT 2D MATRIX AND SUM OF ALL ELEMENT OF 2D MATRIX ALSO SUM WITH ROW WISE
//
//        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int n= arr.length;
////int mat=0;
//        for(int i=0; i<n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] +"  ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//            int sum=0;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                sum +=arr[i][j];
//            }
//            System.out.println("sum of row "+ (i+1) + " is :"+ sum);
//        }
//        System.out.println("Total sum = " + sum);




//     int p=5000;
//     int r=5;
//     int t=2;
//     float si=(p*r*t)/100;
//        System.out.println(si);

//
//
//

//        //PRINT 2D MATRIX AND SUM OF ALL ELEMENT OF 2D MATRIX ALSO SUM WITH ROW WISE AND PRINT TRANSPOSE OF MATRIX
//        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
//        int n= arr.length;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                System.out.print(arr[i][j] +"  ");
//            }
//            System.out.println();
//        }
//
//      //  int n= arr.length;
//        int sum=0;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++) {
//                sum += arr[i][j];
//            }
//            System.out.println("addition of "+(i+1) +" row is :" +sum);
//        }
//
//        System.out.println();System.out.println();System.out.println();
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++) {
//                System.out.print(arr[j] [i] +"  ");
//            }
//            System.out.println();
//
//        }




//// //   BY USER INPUT PRINT 2D MATRIX AND SUM OF LEFT AND RIGHT DIGONAL MATRIX
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of square matrix or 2d array");
//        int n= sc.nextInt();
//        int [][] array=new int[n][n];
//        System.out.println("Enter array elements");
//
//        for(int i=0; i<n; i++) {
//            for (int j = 0; j < n; j++) {
//                array [i][j] =sc.nextInt();
//            }
//        }
//        //for printing 2d matrix
//
//        System.out.println("Matrix");
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int sumLD=0, sumRD=0,midValue=0;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                if(i==j){
//                    sumLD +=array[i][j];
//                }
//                if(i+j==n-1){
//                    sumRD +=array[i][j];
//                }
//                if(i==1 && j==1){
//                    midValue=array[i][j];
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("sum of diagonal");
//        System.out.println("sum of left diagonal = " + sumLD);
//        System.out.println("sum of right diagonal = " + sumRD);
//        System.out.println("Mid value of this array is "+ midValue);





//        // //   BY USER INPUT PRINT 2D MATRIX AND SWAP RIGHT AND LEFT DIAGONAL MATRIX
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of square matrix or 2d array");
//        int n= sc.nextInt();
//        int [][] array=new int[n][n];
//        System.out.println("Enter array elements");
//
//        for(int r=0; r<n; r++) {
//            for (int c = 0; c< n; c++) {
//                array [r][c] =sc.nextInt();
//            }
//        }
//        //for printing 2d matrix
//
//        System.out.println("OUR ORIGINAL MATRIX");
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//        //For swap left and right diagonal
//        for(int i=0; i<n; i++){
//            int temp=array[i][i];
//            array[i][i]=array[i][n-i-1];
//            array[i][n-i-1]=temp;
//        }
//
//        System.out.println("AFTER SWAPPING LEFT AND RIGHT DIAGONAL");
//        //print swapping element
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                System.out.print(array[i][j] + "  ");
//            }
//            System.out.println();
//        }









    }
}
