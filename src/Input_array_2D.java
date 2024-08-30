import java.util.Scanner;

public class Input_array_2D {
    public static void main(String[] args) {
        System.out.println("Om Shree Ganeshaye namah");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of class :");
        int classs=scan.nextInt();
        System.out.print("Enter number of student in each class :");
        int studentcount= scan.nextInt();
        int [][]ar=new int[classs][studentcount];
//        ar [0][0]=1;
//        ar [0][1]=2;
//        ar [0][2]=3;
//        ar [1][0]=4;
//        ar [1][1]=5;
//        ar [1][2]=6;
//        ar [3][1]=99;
        for(int i=0; i< ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print("Enter the marks of student :");
                ar[i][j] = scan.nextInt();
            }
        }
            System.out.println("The marks of students are as below :");



        for(int i=0; i< ar.length; i++)
        {
            for(int j=0; j<ar[i].length; j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();



        }
    }
}
