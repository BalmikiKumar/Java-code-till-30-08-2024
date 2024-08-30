package STREAM_API_AND_ANNOTATION;
//NOTE :-enum ka jitna variable hota hai utna hi baar enum ka constructor call hota hai
enum MethVArCons
{
    PASS,FAIL;
    int age;
    //public static final MetVArCons PASS =new MetVArCons();
    //public static final MetVArCons FAIL =new MetVArCons();
    String name;

    MethVArCons()  //this constructor(MethVArCons) invoked two times for enum data(SUN,MON) THIS IS REQUIRED
    {
        System.out.println("Constructor of MethVarCons");
    }

   public   void   setData(int age, String name) //this is normal constructor
    {
       this.age=age;
         this.name=name;

    }

    public   int getAge(){
        return age;
    }
    public   String getName()
    {
        return name;
    }

    public   void disp()
    {
        System.out.println("Name is "+name +" And age is "+age);
    }

}

//example by hyder sir
enum Result1{
    PASS,FAIL,NR;

    int marks;
    Result1(){
        System.out.println("Constructor of result1");
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    int getMarks()
    {
        return marks;
    }


}
public class enumWithinMethodVariableConstructor {
    public static void main(String[] args) {


     MethVArCons.PASS.setData(60,"Ram");
     int age=MethVArCons.PASS.getAge();
        MethVArCons.PASS.disp();
        System.out.println(age);

        System.out.println("*************************************");
        //example by hyder sir
        Result1.PASS.setMarks(60);  //here invoked constructor "Result1" 3 times
        int marks=Result1.PASS.getMarks();
        System.out.println("Marks = "+marks);
    }
}
