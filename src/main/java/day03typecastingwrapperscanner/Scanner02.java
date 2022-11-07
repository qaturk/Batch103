package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // sayilari kullanicidan alan ve toplama islemi yapan kod
        // scanner clasindan object olustur
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz...");
        double sayi1 = input.nextDouble();
        System.out.println("ikinci sayiyi giriniz...");
        double sayi2 = input.nextDouble();
        System.out.println(sayi1 + sayi2);

    }
}
