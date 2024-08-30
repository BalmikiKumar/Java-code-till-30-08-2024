package RAJU_SIR_JAVA;

class outerClass
{
    //STATIC VARIABLE AND METHOD
    static int x=0;
    void method()
    {
        x++;
    }
    void display()
    {
        System.out.println(x);
    }

    //STATIC INNER_CLAS

   public static class innerClass
    {
       static void staticMethod()
        {
            System.out.println("Static method of static inner class");
        }
    }

    //NON STATIC INNER CLASS

    public class nonStaticInnerClass
    {
        void display()
        {
            System.out.println("Non static method of non static method");
        }
    }

}

public class staticClassAndMethod {
    public static  void main(String [] args)
    {
/*
        String s1="cimage";
        String s2="cimage";
        System.out.println(s1==s2);  //false
        System.out.println(s1.equals(s2));  //true

        StringBuffer s3=new StringBuffer("cim");
        StringBuffer s4=new StringBuffer("cim");
        System.out.println(s3==s4);  // false
        System.out.println(s3.equals(s4));  //false
*/

        outerClass o=new outerClass();
        o.method();
        o.display();
        o.method();
        o.display();

        for(int i=0;i<15;i++)
        {
            o.method();
            o.display();

        }

//        FOR STATIC CLASS
        outerClass.innerClass innerObject=new outerClass.innerClass();
        innerObject.staticMethod();

 //   1ST APPROACH TO ACCESS NON STATIC INNER CLASS
        outerClass.nonStaticInnerClass nonStaticInnerClassObject=o.new nonStaticInnerClass();
        nonStaticInnerClassObject.display();


 //     2ND APPROACH TO ACCES NON_STATIC INNER CLASS
        outerClass.nonStaticInnerClass nsico=new outerClass().new nonStaticInnerClass();
        nsico.display();
    }
}
