package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* System.out.println("ilk isminiz");
        String ilkIsim = input.next();
        System.out.println("ikinci isim");
        String ikinciIsim = input.next();
        System.out.println("soyisminiz");
        String soyisim = input.next();
        System.out.println("tc no");
        String tcno = input.next();
        System.out.println(ilkIsim+""+ikinciIsim+""+soyisim);
        System.out.println(tcno);*/
       /* System.out.println("Ilk, orta, soy isminizi ve kimlik numaranizi giriniz...");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);*/

        System.out.println("ilk, orta ve soyisminizi giriniz");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);
        System.out.println("kimlik no");
        String kimlikNo = input.nextLine();

    }
}
