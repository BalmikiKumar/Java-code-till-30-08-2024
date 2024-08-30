package OneD_2d_array;

import java.util.Arrays;

public class Rotate2Dmatrix {

    public static void rotateMatrix(int [][]arr){
        //step 1 transpose the 2d array

        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=i; j<c; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //step 2 swap the left and right side elements of column
        for(int i=0;i<r;i++){
            int li=0;
            int ri=c-1;
            while (li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;

                li++;
                ri--;
            }
        }
        //print rotated matrix
        System.out.println("Rotated matrix is : ");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        int arr[][]={
                {11,12,13,14},
                {15,16,17,18},
                {19,20,21,22},
                {23,24,25,26}
        };

        //calling function
        rotateMatrix(arr);

        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
    }
}
