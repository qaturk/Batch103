package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //ex 1 javadan giirilen date i ay/gun/yil olarak yaziniz
        LocalDate currentDay=LocalDate.now();
        System.out.println(currentDay);
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM.dd.yyyy");
        String formattedDate1=dtf1.format(currentDay);
        System.out.println(formattedDate1);
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM.dd.yyyy");
        String formattedDate2=dtf2.format(currentDay);
        System.out.println(formattedDate2);
        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMMM.dd.yyyy");
        String formattedDate3=dtf3.format(currentDay);
        System.out.println(formattedDate3);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM.dd/yy");
        String formattedDate=dtf.format(currentDay);
        System.out.println(formattedDate);
        //javadan adigimiz time in formatini degistir
        LocalTime myTime=LocalTime.of(16,23,54,2345);
        System.out.println(myTime);
        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyTime=dtf7.format(myTime);
        System.out.println(formattedMyTime);
        //HH 24 saatlik hh 12 saatlik sistemi kullanir
        DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime2=dtf8.format(myTime);
        System.out.println(formattedMyTime2);


    }
}
