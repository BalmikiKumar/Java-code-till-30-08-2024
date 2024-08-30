package OneD_2d_array;
//specific addition of row and column

public class row_or_column_addition {
    public static void main(String[] args) {

        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        //addition of r2c0 to r3c3
        int sum=0;
        for(int i=2;i<=2;i++){
            for(int j=0;j<=1;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println("Addition : "+sum);

    }
}
