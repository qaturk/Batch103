package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //kullanicidan alinan sayiyi tek mi cift mi old ekrana yaz
        Scanner input = new Scanner(System.in);
        /*System.out.println("bir sayi giriniz...");
        int s = input.nextInt();
        if (s % 2 == 0) {
            System.out.println("cift sayi...");
            if (s % 2 != 0) {
                System.out.println("tek sayi...");
            }
            if (s % 2 == 0) {
                System.out.println("cift sayi..");
            } else {
                System.out.println("tek sayi");
            }
        }
        //bir sayinin negatif pozitif veya notr old veren prog*/
        System.out.println("bir sayi giriniz");
        double d = input.nextDouble();
        if (d > 0) {
            System.out.println("pozitif");
        } else if (d == 0) {
            System.out.println("notr");

        } else {
            System.out.println("negatif");
        }
    }}
