package day04ifstatement;

import java.util.Scanner;
// char variable kullanirsaniniz java onun ascii degerlerini kullanir
//java da + sembolu iki anlamli 1/ toplama 2. birlestirme
public class Scanner02 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        /*System.out.println("ilk isminizi giriniz");
        char ilk = input.next().charAt(0);
        System.out.println("soyisminizi giriniz");
        char son = input.next().charAt(0);
        System.out.println("" + ilk + son);*/
        System.out.println("tam isminizi giriniz");
        String tamIsim = input.nextLine();
        char ilkHarf = tamIsim.charAt(0);
        System.out.println(ilkHarf);
        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);


    }
}
