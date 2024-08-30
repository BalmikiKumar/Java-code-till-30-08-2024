class Calc {
    public int  add(int n1, int n2){
        int result=n1 + n2;
        return result;
    }

    public int  add1(int n1, int n2,int n3){
        int result=n1 + n2 + n3;
        return result;
    }
}


public class methodoverloading {
    public static void main(String[] args) {
        Calc obj=new Calc();
        int result=obj.add(5,6);
        int result1=obj.add1(5,5,5);
        System.out.println(result);
        System.out.println(result1);
    }
}
