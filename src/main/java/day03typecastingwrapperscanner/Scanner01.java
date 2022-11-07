package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //kullanicidan data almak icin
        //scanner clasindan object olsturun
        // kullaniciya ne yapacagini soyle
        System.out.println("kullanici yasini gir");
        byte age = input.nextByte();
        System.out.println("kullacinin yasi " + age);

    }
}
