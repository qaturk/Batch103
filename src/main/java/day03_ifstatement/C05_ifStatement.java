package day03_ifstatement;

import java.util.Scanner;

public class C05_ifStatement {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("lutfen \n toplama islemi icin 1 \n cikarma islemi icin 2 \n bolme icin 3 ");
        int islem= input.nextInt();
        System.out.println("lutfen iki tamsayi giriniz:  ");
        double num1= input.nextDouble();
        double num2= input.nextDouble();
         if (islem==1){
             System.out.println("toplama sonucu :"+num1+"+"+num2+"="+(num1+num2));

         } else if (islem==2) {
             System.out.println("cikarma sonucu :"+num1+"-"+num2+"="+(num1-num2));


         } else if (islem==3) {
             System.out.println("bolme sonucu :"+num1+"/"+num2+"="+(num1/num2));


         }


    }
}
