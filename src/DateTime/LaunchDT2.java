package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class LaunchDT2 {
    public static void main(String[] args) {

        LocalDate date=LocalDate.now();
        System.out.println(date);
//NOTE :- FOR KNOWING ABOUT LocalDate type in terminal javap java.time.LocalDate
//NOTE :- FOR KNOWING ABOUT LocalTime type in terminal javap java.time.LocalTime

        int d= date.getDayOfMonth();
        int m= date.getMonthValue();
        int y=date.getYear();
        System.out.println(d + "/"+m +"/"+y);


        LocalTime time=LocalTime.now();
        System.out.println(time);

        int h= time.getHour();
        int min= time.getMinute();
        int s= time.getSecond();
        int ns= time.getNano();
        System.out.println(h +" hour "+ min +" min "+s +" sec " +ns+" nanoSec");

    }
}
