package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //kullanicidan gun ismini alip o gunu h ici  hafta sonu old soyle
        Scanner input = new Scanner(System.in);
        System.out.println("bir gun giriniz");
        String gun = input.next();
        if (gun.equalsIgnoreCase("pazar")){
            System.out.println("hafta sonu");
        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("hafta sonu");
        } else if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("hafta ici");
        } else if (gun.equalsIgnoreCase("sali")) {
            System.out.println("hafta ici");
        } else if (gun.equalsIgnoreCase("carsamba")) {
            System.out.println("hafta ici");
        } else if (gun.equalsIgnoreCase("persembe")) {
            System.out.println("hafta ici");
        } else if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("hafta ici");
        } else {
            System.out.println("gecerli bir gun giriniz");
        }
        if (gun.equalsIgnoreCase("pazar")||gun.equalsIgnoreCase("cumartesi")){
            System.out.println("haftasonu");

        } else if (gun.equalsIgnoreCase("pazartesi") ||
                (gun.equalsIgnoreCase("sali")) ||
                        (gun.equalsIgnoreCase("carsamba")) ||
                                (gun.equalsIgnoreCase("persembe")) ||
                                        (gun.equalsIgnoreCase("cuma"))) {
        } else {
            System.out.println("gecerli bir gun giriniz!..");
         {

        }
    }/*Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
    Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
    i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
    ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.*/
boolean haftaSonu = gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("cumartesi");
boolean haftaIci= (gun.equalsIgnoreCase("pazartesi") ||
        (gun.equalsIgnoreCase("sali")) ||
        (gun.equalsIgnoreCase("carsamba")) ||
        (gun.equalsIgnoreCase("persembe")) ||
        (gun.equalsIgnoreCase("cuma")));
if (haftaSonu){
    System.out.println("haftaSonu");
} else if (haftaIci) {
    System.out.println("hafta ici..");

}else{
            System.out.println("gecerli bir gun giriniz..");
        }
    }}
