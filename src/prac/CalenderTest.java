package prac;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalenderTest {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date  =date.minusDays(today -1);//set to start of the month
        DayOfWeek weekday = date.getDayOfWeek();
        int value =weekday.getValue();//1==monday,....5=friday e.t.c

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i =1; i<value; i++){
            System.out.println("    ");
        }
        while (date.getMonthValue() == month){
            System.out.printf("%3d", date.getDayOfMonth());

            if (date.getDayOfMonth() == today){
                System.out.println("*");
            }else{
                System.out.println(" ");
            }

            if (date.getDayOfWeek().getValue() == 7){
                System.out.println();
            }else{
                System.out.println(" ");
            }
            //move to next day
            date=date.plusDays(1);
        }
        if (date.getDayOfWeek().getValue() !=7){
            System.out.println();
        }

    }
}
