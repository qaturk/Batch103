package day07ternarystringmanipulation;

public class NestedTurnary01 {
    public static void main(String[] args) {
        //verilen yilin leap year olup olmadigini kontrol eden kod
        int year=1601;
       String leap=year%100==0 ? (year%400==0 ? "leap year" :"leap year degil") : (year%4==0 ? "leap year":"leap year degil");
        System.out.println(leap);

        //kurallara gore pswrd un gecerli olup olmadigini kontrol eden kod
        //sekizkarakterden fazla veya 8 ise ilk harfi i
        //sekiz karakterden azise ilk harhi k olmali
        String pwd ="i2a3ed";
       String gecerli= pwd.length()<8 ? (pwd.charAt(0)=='k'?"gecerli":"gecersiz"):(pwd.charAt(0)=='i'?"gecerli":"gecersiz");
        System.out.println(gecerli);
    }
}
