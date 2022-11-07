package day07ternarystringmanipulation;

public class Ternary01 {
    public static void main(String[] args) {
        //bir sayinin pozitif veya negatif oldekrana yazdiran prog
        int a=-12;
        if (a>0){
            System.out.println("pozitif");

        } else {
            System.out.println("pozitif degil");
        }
        //2/yol ternary
        String sonuc= a>0 ? "pozitif" : "pozitif degil";
        System.out.println(sonuc);
        int b=23;
        int c=23;
       int min= b<c ? b:c;
        System.out.println(min);
        // verilen bir sayinin mutlak degrini hesaplayan
        int d=-45;
        int abs=d<0 ? d*-1 :d;
        System.out.println(abs);
        //iki tane sayi ayni isaretli ise bu sayilari carp farkli ise islem yapamam de
        int e=12;
                int f=10;
        Object islem=(e>0&& f>0 ) || (e<0&& f<0) ? e*f :"islem yapamam";
        System.out.println(islem);
//object clasin parenti yoktur





    }
}
