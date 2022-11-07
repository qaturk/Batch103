package day06nestedifswitch;

import java.util.Locale;
import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ay ismini giriniz..");
        String ayIsmi= input.next().toLowerCase();
        switch (ayIsmi){
            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "ekim":
                System.out.println("ekim");
            case "kasim":
                System.out.println("kasim");
            case "aralik":
                System.out.println("aralik");
                break;
            default:
                System.out.println("gecerli ay ismi gir..");
        }
        //toLoverCasebuyk harfleri kucuge cevirir
        //toUpperCase kucuk harfleri buyuge cevirir

    }
}
