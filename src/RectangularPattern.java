import java.util.Scanner;
public class RectangularPattern {
    public static void main(String[] args) {                          //*********
        Scanner sc = new Scanner(System.in);                          //*********
        System.out.println("enter row value");                        //*********
        int r = sc.nextInt();
        System.out.println("enter column value");
        int c = sc.nextInt();

        for (int i=1; i<=r; i++){
            for(int j = 1; j <=c; j++){
                System.out.print("* ");
            }

            System.out.println();

        }

        //table print
                               //*********
        System.out.println("Enter Table number : ");
        int t=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(t+" * "+ i+" = "+t*i);
        }

    }
}
