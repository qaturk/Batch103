package day03_ifstatement;

public class C04_MantikOperatorleri{
    //&&
    public static void main(String[] args) {
        System.out.println(5+2==8);
        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc1==>"+sonuc1);

        boolean sonuc2= false;
        System.out.println("sonuc2.."+sonuc2);
        int sayi1=15;
        System.out.println(10<sayi1 && sayi1<20);
        int sayi2=5;
        System.out.println("sayi2 10 ile 20 arasinda degildir.."+(sayi2<10 || sayi2>20));

    }

}
