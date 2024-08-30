import java.util.Scanner;

class Pattern
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter row/column value : ");
        int n=sc.nextInt();
        //int n=5;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if (i==j || i+j==n-1) // THIS CONDITION FOR FOR X SHAPE
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print(" ");
                }
            }


            System.out.print("     |    ");  //FOR GAPING BETWEEN (X AND Z)

            for (int j=0; j<n; j++)
            {
                if (i==0 || i==n-1 || i+j==n-1)    // THIS CONDITION FOR FOR Z SHAPE
                {
                    System.out.print("Z");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.print("     |    ");  //FOR GAPING BETWEEN (X AND Z)

            for (int j=0; j<n; j++)
            {
                if (i==0 || i==n-1 || j==0 || j==n-1)    // THIS CONDITION FOR FOR Z SHAPE
                {
                    System.out.print("Z");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.print("     |    ");  //FOR GAPING BETWEEN (X AND Z)

            for (int j=0; j<n; j++)
            {
                if (i==(n-1)/2 || i+j>=(n-1)/2 && i+j==(n-(n)/2))    // THIS CONDITION FOR FOR Z SHAPE
                {
                    System.out.print("Z");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }

        for(int i=1;i<=5;i++){
            for(int s=1;s<i;s++){
                System.out.print("");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}