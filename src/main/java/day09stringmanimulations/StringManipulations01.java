package day09stringmanimulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str="java is easy";
       int idxA= str.indexOf("a");
        System.out.println(idxA);
        //INDEXOF MEDHODU VERILEN CHARACTER VEya carackterlerin ilkgorunumunun sira numarasini verir

        //lastindexof istenen son karakterin sonuncusunun sira numarasini verir

       int idxA2= str.lastIndexOf("a");
        System.out.println(idxA2);

        String stra="Kara kara dusunme ankara";
        int idxA3= stra.indexOf("kara");
        System.out.println(idxA3);

        String s="mississippi";
        int idxI=s.indexOf('i');
        System.out.println(idxI);
        int idxIss=s.indexOf("iss");
        System.out.println(idxIss);
        int idxIss2=s.lastIndexOf("iss");
        System.out.println(idxIss2);
//example1 bir stringteki characterdeki tekrarli veya tekrarsiz olup olmadigini veren kod

      /*  String t="helloooo";
        char c='H';
        if (t.indexOf(H )==t.lastIndexOf('H'));
        {
            System.out.println("tekrarsiz");
        }else{
            System.out.println("tekrarli");*/
        String u="Learn java earn money";
       int sonuc= u.indexOf("n",5);
        System.out.println(sonuc);
        int sonuc2=u.lastIndexOf("a",5);
        System.out.println(sonuc2);
        String v="java is java";
        boolean bosmu=v.isEmpty();
        System.out.println(bosmu);
        String x=" ";
        boolean blankMi=x.isBlank();
        System.out.println(blankMi);
        //kullanicidan alinan isim mutlaka space den farkli en az bir karakter icermelidir
        Scanner input= new Scanner(System.in);
        System.out.println("ilk isminizi giriniz");
        String ilk=input.nextLine();
        if (ilk.isBlank()) {
            System.out.println("sana ismini gir dedim");

        }else{
            System.out.println(ilk);
        }

        }






    }

