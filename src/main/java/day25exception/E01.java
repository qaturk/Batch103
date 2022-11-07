package day25exception;

public class E01 {
    public static void main(String[] args) {
        /*
       1)"Exception" (istisnai hata) Java'da kodlarımızı çalıştırırken meydana gelen beklenmedik durumlardır
       2)Exception'lar ile çalışmanın iki yolu vardır
              a)try-catch block kullanma ve exception oluşsa bile çalışmayı devam ettirme.
              b)throw exception kullanarak çalışmayı durdurma (mesela yazdığımız kod gereği bir dosya üzerinden okuma yapmamız gerekiyor ise
                                                               bu dosyamız eğer silinmiş ise java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)
       3) Eğer exception'ı handle etmez isek (sorunu halletmezsek) java çalışmayı durdurur.
       4) try-catch kullanırken try kodunu bir yada birden fazla catch ile birlikte kullana biliriz.
       5) try catch olmaksızın yanlız kullanılamaz
        6)Eğer yazmış olduğunuz herhangi bir kod satırında problem olabileceğini düşünüyorsanız try-catch block içine koymalısınız.
    7) catch block parantezi içerisine olması muhtemel exception class ismi yazılır.
    8)e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
      System.out.println(); burada yazmış olduğum mesajlar benim teknik olmayan açıklamalarımdır
      e.printStackTrace(); methodu Exception ile ilgili detaylıca teknik mesaj verir. kod çalışmaya devam eder
      System.err.ptinln(); hata mesajını renkli olarak verir bu sayede console'da diğer mesajlardan ayırmak için kullanabiliriz.
    9)Eğer try body içindeki kod sorunsuz çalışırsa catch block devreye girmez
     */
        divide(6,2);//3
        divide(0,2);//0
        divide(4,12);//0
        divide(6,0);

        divide2(12,3);
        divide2(5,0);
    }//1. yol  tavsiye edilmez
    public static void divide(int a,int b) {
        if (b == 0) {
            System.out.println("bir sayi sifir ile bolunemez");
        } else System.out.println(a / b);

    }
//2. yol try-catch kullanarak exception i handle etmek tavsiye edilir
    public static void divide2(int a,int b){
        try {

            System.out.println(a/b);
            System.out.println("hi exception");

        }catch (ArithmeticException e){
            //Burada yazdigimiz e : 'Javanin exeptionu atayacagi obje
            System.out.println("bolme isleminde bir problem olustu"+e.getMessage());
            e.printStackTrace();
            System.err.println("bolme isleminde problem olustu");

        }
//matematik ile ilgili karsilasilmasi muhtemel tum istisnalari hatalari ArithmeticException classina koymustur

    }



}

