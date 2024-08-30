package RajuSirJava;
class Student{
    String name;
    int marks;

    Student(String stuName){
        name=stuName;

    }
    public void setMarks(int setmarks)
    {
        marks=setmarks;
    }

    void print(){
        System.out.println("Name = "+name);
        System.out.println("Marks ="+marks);
    }

}







//class Country{
//    //static int countryCountry;
//    String name;
//    int dummyCountry;
//
//    Country(String name,int dummyCountry){
//        this.name=name;
//        this.dummyCountry=dummyCountry;
//    }
//    Country(String name)
//    {
//        this.name=name;
//    }
//
//    String getName(){
//        return name;
//    }
//    int getAge()
//    {
//        return dummyCountry;
//    }
//}
//public class StaticVAriable{
//    public static void main(String[] args) {
//        Country ob1=new Country("Balmiki",5);
//        System.out.println(ob1.getName()+" and age is "+ob1.getAge());
//
//        Country ob2=new Country("Balmiki",5);
//        System.out.println(ob2.getName());
//    }
//
//}











//class Country{
//     int countryCounter;
//    String name;
//    int dummyCounter;
//
//    Country()
//    {
//        countryCounter++;
//    }
//
//}
//
public class StaticVAriable {
    public static void main(String[] args) {

        Student st=new Student("balmiki");
        st.setMarks(99);

        Student st1=new Student("Gunjan");
        st1.setMarks(98);

        Student st2=new Student("rahul");
        st2.setMarks(97);

        st.print();
        st1.print();
        st2.print();

//        Country ob1=new Country();
//        ob1.name="India";
//        ob1.dummyCounter=1;
//        ob1.countryCounter=2;
//
//        Country ob2=new Country();
//        ob2.name="Nepal";
//        ob2.dummyCounter=2;
//
//
//        System.out.println("ob1.countryCounter ="+ob1.dummyCounter);
//        System.out.println("ob2.countryCounter ="+ob2.dummyCounter);
//        System.out.println("ob2.countryCounter ="+ob2.countryCounter);
//        //System.out.println("CountryCounter ="+Coun);
    }
}
