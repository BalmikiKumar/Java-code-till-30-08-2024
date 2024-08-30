class jonSechudling{
    public static void main(String args [ ]){
        System.out.println("Hello world");
        int array[]={1,2,3,4,5,6,7,8,9};
        System.out.println(array[5]);
        int arr[][]={
                {1,2},{3,4},{5,6},{7,8}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}