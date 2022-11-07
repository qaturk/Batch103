package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {
        //ex 1 japonya ile almanya arasi zaman farkini hesaplayan kod
        LocalDateTime japonyaTime=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime almanyaTime=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark= ChronoUnit.HOURS.between(japonyaTime,almanyaTime);
        System.out.println(fark);
        // ex 2 sabit bir tarih olustur
        LocalDate myDate= LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);
        //ex 3 USA Woow! UK big CANADA Cold
        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"
        Countries country=Countries.USA;
        switch (country){
            case USA:
                System.out.println("Woow!");
            case CANADA:
                System.out.println("Cold");
            case UK:
                System.out.println("BIG");
            case TURKEY:
                System.out.println("Vatan");
            case RWANDA:
                System.out.println("cay");
            case GERMANY:
                System.out.println("araba");
            default:
        }
    }
}
