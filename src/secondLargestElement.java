public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr={4,6,9,6,2,8,6};

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        for(int num:arr){
            max1=Math.max(max1,num);
        }
        System.out.println("first largest element is : "+max1);

        for(int num:arr){
            if(num !=max1) max2=Math.max(max2,num);
        }

        if(max2==Integer.MIN_VALUE) System.out.println("No second largest element found");
        else System.out.println("second largest element is : "+max2);


        //for max3 element
        for(int num:arr){
            if(num !=max2 && num!=max1) max3=Math.max(max3,num);
        }

        System.out.println("max 3 element :"+max3);


    }
}
