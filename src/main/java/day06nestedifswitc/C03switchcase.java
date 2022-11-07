package day06nestedifswitc;

import java.util.Scanner;

public class C03switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir gun giriniz");
        String gun = input.next().toUpperCase();


        switch (gun) {
            case "PAZARTESI":


            case "SALI":
                System.out.println("java");
                break;
            case "CARSAMBA":


            case "PERSEMBE":
                System.out.println("SELENYUM");
                break;
            case "CUMA":

            case "CUMARTESI":
                System.out.println("sql");
                break;
            case "PAZAR":
                System.out.println("off");
                break;
            default:
                System.out.println("gecerli gun sayisi giriniz");
        }
    }
}