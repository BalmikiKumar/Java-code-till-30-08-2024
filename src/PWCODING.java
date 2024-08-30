import java.util.Scanner;

public class PWCODING {
    public static void main(String[] args) {

        System.out.println("jai shree ram");
        int array[][]= new int[2][3];
        System.out.println(array.length);
        System.out.println(array[0].length);

        for(int i=0; i<= array.length-1; i++){
            for(int j=0; j< array[i].length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();

        }

        //user input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter row value :");
        int row=scanner.nextInt();
        System.out.println("Enter column value :");
        int column=scanner.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("Enter array elements");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Your enter array elements are : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }


    }
}
