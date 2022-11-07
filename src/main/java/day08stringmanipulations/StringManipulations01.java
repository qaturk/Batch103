package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
       // kullanicidan aldiginizismin ilk ve son harfini al kod
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim= input.next();
        char ilkHarf=isim.charAt(0);
        char sonHarf=isim.charAt(isim.length()-1);
        System.out.println(""+ilkHarf+sonHarf);

        //2/yol
        //substring() in iki kullanimi vardir.
        //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
        //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar

        String ilk= isim.substring(0,1);
       String son= isim.substring(isim.length()-1);
        System.out.println(ilk+son);


//ornek verilen stringdeki hayvan isimleri ekrana yazdir
        String str="ben kedi esim tavuk oglum inek sever";
       String kedi= str.substring(4,8);
        String tavuk=str.substring(14,20);
       String inek=str.substring(26,30);
        System.out.println(kedi + tavuk + inek);
        //ilk isim ve soyisimin ilkharflerini yazdir
        //Example 3: Ilk isim ve soy isimi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdiriniz
        //           Ali Can ==> AC       Tahsin Yurdakul ==> TY
        System.out.println("Ilk ve soy isminizi giriniz");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0, 1);

        String b = tamIsim.split(" ")[1].substring(0, 1);

        System.out.println(a + b);


    }
}
