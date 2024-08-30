
class A{
    private int a;
    private int b;
    private int c;
    A(){
        System.out.println("Empty constructor");
    }
    A(int a){
        System.out.println("Empty constructor");
        this.a=a;
    }
    A(int a,int b){
        System.out.println("Empty constructor");
        this.a=a;
        this.b=b;
    }A(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

}


public class method_Overloading {
    public static void main(String[] args) {
        A a=new A();

    }
}
