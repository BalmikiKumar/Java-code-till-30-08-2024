//METHOD OVERLOADING ME EK HI METHOD NAME SE MULTIPLE VARIABLE NAME DE SAKTE HAI BUT USKA DATA TYPE YA PARAMETER DIFFERENT HONA CHAHIYE
//YAHA MAINE 3 METHOD BANAYE HAI JISKA NAM SAME HAI ( TINO KA NAM add HI HAI BUT 1ST AND 2ND KA PARAMETER 2 HAI BUT DATA TYPE DIFFERENT HAI EK KA INT TO DUSRE KA DOUBLE HAI)
//OR 1ST AND 3ND KA DATA TYPE INT HAI BUT BUT PARAMETER DIFFERENT HAI , 1ST KA 2 HAI , TO 3RD KA 3 HAI
class Addition
{
    int add(int n1,int n2)
    {
        int result=n1+ n2;
        return result;
    }

    double add(double n1,double n2)
    {
        double result=n1+ n2;
        return result;
    }

    int add(int n1,int n2, int n3)
    {
        int result=n1+ n2 + n3;
        return result;
    }
}

public class overloading_practice {
    public static void main(String[] args) {

        Addition obj=new Addition();
        int result= obj.add(21,20);
        double result1= obj.add(6.6, 2.3);
        int result3= obj.add(6,6,6);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result3);
    }
}
