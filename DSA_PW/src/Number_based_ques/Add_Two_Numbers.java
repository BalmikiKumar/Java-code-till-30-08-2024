package Number_based_ques;

class Addition{
    public int Add(int x,int y){
        int c=x+y;
        return c;
    }



    //Addition of natural numbers , 1st approach
    public int addNaturalNum(int x){
        int sum=0;
        for(int i=1;i<=x;i++){      // tc=0(n),  sc=0(1)
             sum=sum+i;
        }
        return sum;
    }

    //Addition of natural numbers , 2nd approach
    int sum=0;
    public int addNaturalNum2( int x){
        sum=(x * (x+1))/2;       //tc=0(1) , sc=0(1)
        return sum;
    }

}

public class Add_Two_Numbers {
    public static void main(String[] args) {
        Addition addition=new Addition();
        int result=addition.Add(10,20);
        System.out.println("Addition of two number is : "+result);

        int resultOfNatural=addition.addNaturalNum(10);
        System.out.println("Addition of natural number 1st approach : "+resultOfNatural);

        int resultOfNaturalNum2=addition.addNaturalNum2(10);
        System.out.println("Addition of natural number 2nd approach : "+resultOfNaturalNum2);
    }
}
