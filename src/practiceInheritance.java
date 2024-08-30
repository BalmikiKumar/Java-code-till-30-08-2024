class  Parentt{
    public  void methodOne()
    {
        System.out.println("methodOne from parent");
    }
    public  void Par(){
        System.out.println("Par Par");
    }

}
class Child extends  Parentt{
    @Override
    public  void  methodOne ()
    {
        System.out.println("methodOne from child");
    }
    public  void  methodTwo()
    {
        System.out.println("methdTwo from child");
    }
}
public class practiceInheritance {
    public static void main(String[] args) {
        Parentt p=new Parentt();
        System.out.println(p.hashCode());
        p.methodOne();
        Child c=new Child();
        c.methodOne();
        c.methodTwo();

        Parentt pp=new Parentt();
        pp.methodOne();
       c.methodTwo();

     //  Child child=  new Parentt();
       Parentt parentt=new Child();
        parentt.Par();



    }
}
