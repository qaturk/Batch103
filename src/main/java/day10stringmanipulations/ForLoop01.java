
package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: Ekrana 5000 kere "Hi" yazdiriniz.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Tekrarli isler icin "loop" kullaniriz
        //Dort cesit "loop" vardir; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop
        //Example 2: Ekrana 5 kere "Hi" yazdiriniz.

        //  Baslangic degeri Loop hangi sart altinda calisacak Increment(Artirma) veya Decrement(Azaltma)
        for( int i = 1      ;           i<6                   ;               i++                ){
            System.out.println("Hi");
        }

        //Example 3: 4 den 7 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for(int i=4; i<8; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 4: 14 den 5 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for(int i=8;  i>4; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 5: 13 den 5 e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz
        //Cift sayilar: 14, 12, 10, 8, ...

        //1.Yol:
        for(int i=14; i>4;  i=i-2){
            System.out.print(i + " ");//14 12 10 8 6
        }

        System.out.println();

        //2.Yol:
        for(int i=14; i>4; i--) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            for (int n = 28; n < 158; n++) {
                if (n % 2 != 0) {
                    System.out.print(n + " ");
                }
                System.out.println();
            }
            //example7njava stringini j*a*v*a stringine cevir
            String str = "java";
            for (int t = 0; t < str.length(); t++) {
                System.out.print(str.charAt(t) + "*");
            }
            //verilen stringte tekrarsiz harakterleri yazin
            System.out.println();

            //Example 8: Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz
            //           "Hellooo Ali" ==> He Ai
            String s = "Hellooo Ali";
            for (int m = 0; m < s.length(); m++) {
                char c = s.charAt(m);
                if (s.indexOf(c) == s.lastIndexOf(c)) {
                    System.out.print(c);//He Ai

                }
            }
        }






















    }
}




















