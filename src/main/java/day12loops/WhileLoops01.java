package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    //3 ten 10 a kadar tamsayilari ayni satirda ekrana yazdir
    public static void main(String[] args) {
        for (int i=3;i<11;i++){
            System.out.print(i+" ");

        }
        System.out.println();
        //2.yol
        int i=3;
        while (i<11){
            System.out.print(i+" ");
            i++;
        }
        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int k =17;
        while(k>3){
            if (k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }
        System.out.println();

        //Example 3: 12 den 67 ye kadar sayilarin toplamini veren kodu yazınız

        int sum=0;
        int m = 12;

        while(m<68){

            sum = sum +m;

            m++;

        }
        System.out.println(sum);
// example4 verilen tamsayini rakamlari tolamini ekrana yazdir
        int sonuc=0;
        int sayi=385;
        while (sayi>0){
            sonuc=sonuc+sayi%10;
            sayi=sayi/10;
            System.out.println(sonuc);
        }
        // example 5 kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int s= input.nextInt();
        int n=1;
        while (n<11){
            System.out.println(s + " x "+n+" = " + s*n);
            n++;
        }



    }
}




