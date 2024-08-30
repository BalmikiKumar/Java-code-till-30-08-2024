package OneD_2d_array;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row size");
        int r=scanner.nextInt();

        System.out.println("Enter column size");
        int c=scanner.nextInt();
        int array[][]=new int[r][c];

        System.out.println("Enter row and column elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Array elements are ;");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
