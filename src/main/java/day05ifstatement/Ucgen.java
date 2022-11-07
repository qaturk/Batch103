package day05ifstatement;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
      /*  Scanner scan4 = new Scanner(System.in);
        System.out.println("bir karakter giriniz...");
        char ch = scan4.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println( ch+" "+ch+" "+ch+" ");*/
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
// 1) 1 ler basamagindaki sayiyi bulun
        int birler = sayi % 10;
        System.out.println("girdiginiz sayinin birler basamagi " + birler);
        sayi /= 10;
// 2) 10 lar basamagindaki sayiyi bulun
        int onlar = sayi % 10;
        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);
// 3) 100 ler basamagindaki sayiyi bulun
        int yuzler = sayi /= 10;
        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);

    }
}
