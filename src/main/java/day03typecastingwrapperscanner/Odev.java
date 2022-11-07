package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dairenin yaricapini giriniz");
        float yaricap = input.nextFloat();
        System.out.println("alan "+3.14*yaricap*yaricap);
        System.out.println("cevre" +2*3.14*yaricap);
    }
}
