package STREAM_API_AND_ANNOTATION;


import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Annotation;

//import java.lang.annotation.*;
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR})//target means where we
// use our custom annotation(thru this targer annotatin use for clas,method,variable,constructor

@Retention(RetentionPolicy.RUNTIME) //for power(which levels it have power eg. compile time,runtime)
@interface Cricket{
    String country() default "India";
    int age() default 34;


}

//@Cricket(country ="India",age=34)  //when we not provide default value
@Cricket
class virat {
    @Cricket
    int innings;
    int runs;
//    @Cricket(country="India" , age = 34)  //when we not provide default value
    //String name="Virat";
//    @Cricket(country = "India" , age=34)    //when we not provide default value


    @Cricket
    public void setInnings(int innings){
         this.innings= innings;
    }



    public int getInnings() {
        return innings;
    }

    public void setRuns(int runs){
        this.runs=runs;
    }


    public int getRuns() {
        return runs;
    }

}
public class Annotation_create {
    public static void main(String[] args) {
        virat v=new virat();
        v.setInnings(300);
        v.setRuns(60000);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        //FETCHING VALUE THAT PRESENT IN Cricket ANNOTATION
        Class c=v.getClass();
        Annotation a=c.getAnnotation(Cricket.class);
        Cricket cc=(Cricket)a;

        String country=cc.country();
        System.out.println(country);

        int age=cc.age();
        System.out.println(age);
    }
}
