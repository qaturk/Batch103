package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {
        //ex 1 anlik tarihi ekrana yazdir
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);
        //ex 2 anlik zaman
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);
        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);
        //ex 4 japonyadaki anlik saati  ekrana yazdir
        LocalDateTime currentDateTimeInJapan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);
        LocalDateTime currentDateTimeInIstanbul=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);
        // bu gunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesa
        // kodu yaz
        LocalDate countdate=LocalDate.of(2022,10,21);
        LocalDate retireDate=countdate.plusDays(789);
        System.out.println(retireDate);
        //iki cocugunuzun dogum tarihleri arasindaki fark
        LocalDate dobHasan=LocalDate.of(2013,6,20);
        LocalDate dobKubra=LocalDate.of(2014,9,10);
        Long diff=ChronoUnit.DAYS.between(dobHasan,dobKubra);
        System.out.println(diff);
        //tom aliden 3 yil 8 ay 13 gun sonra dogdu ali ise veliden 1 yil 15
        // once dogdu tomun dogum tarihi 18 kasim 2011 ali ve veli nin dogum tarihlerini bulun
        LocalDate dobtom=LocalDate.of(2011,11,18);
        LocalDate retireAli=dobtom.plusYears(3).plusMonths(8).plusDays(13);
        LocalDate retireVeli=retireAli.plusYears(1).plusDays(15);
        System.out.println(retireVeli);
        System.out.println(retireAli);
        // 29 mayis 1453 ist fethi 29 ekim 1923 arasinda kac ay old gost
        LocalDate istFethi=LocalDate.of(1453,5,29);
        LocalDate cumKuruluusu= LocalDate.of(1923,10,29);
        Long aySayisi=ChronoUnit.MONTHS.between(istFethi,cumKuruluusu);
        System.out.println(aySayisi);
        // verilen tariihin hangi burcta old gost kodu

        LocalDate myDate= LocalDate.of(1989,12,7);
        int day= myDate.getDayOfMonth();
        int month=myDate.getMonthValue();
        System.out.println(day+" - "+month);
        if (day>=21&&month==3){
            System.out.println("koc");
        }else if (day<=20&& month==4) {
            System.out.println("koc");
        }else if (day>=21&&month==4){
            System.out.println("boga");
        }else if (day<=20&& month==5) {
            System.out.println("boga");

        }else if (day>=21&&month==5){
            System.out.println("ikizler");
        }else if (day<=20&& month==6) {
            System.out.println("ikizler");

        }else if (day>=21&&month==6){
            System.out.println("yengec");
        }else if (day<=20&& month==7) {
            System.out.println("yengec");

        }else if (day>21&&month==7){
            System.out.println("aslan");
        }else if (day<20&& month==8) {
            System.out.println("aslan");

        }else if (day>21&&month==8){
            System.out.println("basak");
        }else if (day<20&& month==9) {
            System.out.println("basak");

        }else if (day>21&&month==9){
            System.out.println("terazi");
        }else if (day<20&& month==10) {
            System.out.println("terazi");
        }


    }
}
