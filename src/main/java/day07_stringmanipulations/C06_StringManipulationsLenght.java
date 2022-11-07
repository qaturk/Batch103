package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLenght {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
/**
 * Length()
 * length() method'u girilen String'in uzunlugunu verir
 * butun karakterlerin adedi (bosluklar da birer karakterdir)
 */
public static void main(String[] args) {
    String cumle="bugun hava yagmurlu";
    System.out.println(cumle.length());
    String str1="";
    System.out.println(str1.length());

    Scanner input=new Scanner(System.in);
    System.out.println("lutfen isminizi ve soyisminizi giriniz :\n isim:");
    String isim=input.next();
    System.out.println("soyisim");
    String soyisim=input.next();
    if (isim.length()>soyisim.length()) {
        System.out.println("isminiz soyisminizden uzun");
    } else if (isim.length()<soyisim.length()) {
        System.out.println("soyisminiz uzun");
    } else System.out.println("isminiz ve soyisminiz esit uzunlukta");

    System.out.println();
    Scanner input2=new Scanner(System.in);
    System.out.println("lutfen 4 karakterli bir kelime giriniz");
    String kelime=input2.next();
    System.out.println(kelime.length());
    if (kelime.length()==4) {
        char bir = kelime.charAt(0);
        char iki = kelime.charAt(1);
        char uc = kelime.charAt(2);
        char dort = kelime.charAt(3);
        System.out.println("tersten yazilmis hali:" + dort+uc+iki+bir);
    } else if (kelime.length()>4) {
        System.out.println("4karakterli bir kelime giriniz");
    } else if (kelime.length()<4) {
        System.out.println("4karakterli bir kelime giriniz");

    }

}
}





