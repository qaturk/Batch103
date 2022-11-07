package day06nestedifswitc;

import java.util.Scanner;

public class C02ternary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen notunuzu girin");
        String finalNotu= input.next();
        String result=(finalNotu.equalsIgnoreCase("A"))    ?"cok basarili":
                (finalNotu.equalsIgnoreCase("B"))    ?"basarili":
                        (finalNotu.equalsIgnoreCase("C"))    ?"orta":
                                "digerleri";
        System.out.println("resault   :"+result);
        System.out.println();

    }
}
