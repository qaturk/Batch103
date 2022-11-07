package day06nestedifswitc;

import java.util.Scanner;

public class C01ternary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen pozitif bir sayi giriniz");
        int sayi=input.nextInt();
        System.out.println();
        System.out.println("*********ternary ile cozum*******");
        String sonuc=(sayi>0)
                ?(sayi>99&&sayi<1000)     ?("3 basamakli buyuk sayi") : (sayi%2==0)
                ?("3 basamakli 0 dan buyuk sayi"):("3 basamakli olmayan tek sayi"):
                "lutfen sifirdan buyuk bir sayi giriniz";
        System.out.println(sonuc);
        System.out.println("****if else*******");
        if (sayi>0){
            if (sayi<1000&&sayi>99) {
                System.out.println("3 basamakli pozitif sayi");
            }else if (sayi%2==0) {
                System.out.println("3 basamakli olmayan cift sayi");
            }else
                System.out.println(" 3 basamakli olmayan tek sayi");
            }
        }

    }
