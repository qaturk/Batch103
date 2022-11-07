package day03_ifstatement;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //bir iscinin isi bitirme suresini ve toplam isci sayisini hesaplayankod
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen işçi sayısını giriniz  :" );
        int isciSayisi= input.nextInt();

        Scanner INPUT =new Scanner(System.in);
        System.out.println("lütfen ishacmini giriniz  :");
        double isHacmi=input.nextDouble();

        double bitirmeSuresi= (isHacmi/isciSayisi);
        System.out.println("işi bitirme süresi   :"+bitirmeSuresi);
        }
    }

