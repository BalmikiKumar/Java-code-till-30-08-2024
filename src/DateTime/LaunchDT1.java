package DateTime;

//import java.sql.Date;

//import java.util.Date;
public class LaunchDT1 {
    public static void main(String[] args) {
        java.util.Date date=new java.util.Date();
        System.out.println(date);
 //NOTE :- FOR KNOWING THE DETAILS INFORMATION ABOUT DATE, TYPE IN TERMINAL javap java.util.Date

        long onlyDate=date.getTime();




        java.sql.Date date1=new java.sql.Date(onlyDate);// sql is a package
        System.out.println(date1);

    }
}
