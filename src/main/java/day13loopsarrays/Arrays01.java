package day13loopsarrays;




import java.util.Arrays;
import java.util.Collections;

    public class Arrays01 {

    /*
        1)Ayni data tipinde, coklu data'i depolmaka icin Java'nin olusturdugu yapilar vardir.
          Bu yapilardan birisi de "Array" lerdir.
     */

        public static void main(String[] args) {

            //Array nasil olusturulur?
            int stdAges[] = new int[7];// [ 0, 0, 0, 0, 0, 0, 0 ]

            //Array nasil yazdirilir?
            System.out.println(Arrays.toString(stdAges));

            //Array'lere elemanlar nasil eklenir?
            stdAges[1] = 11;
            stdAges[0] = 12;
            stdAges[2] = 13;
            stdAges[3] = 14;
            stdAges[4] = 10;
            stdAges[5] = 12;
            stdAges[6] = 12;
            System.out.println(Arrays.toString(stdAges));// [12, 11, 13, 14, 10, 12, 12]

            //Array'deki herhangi bir elemani nasil yazdirabiliriz?
            System.out.println(stdAges[4]);//10

            //Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
            Arrays.sort(stdAges);
            System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]

            int ilk = stdAges[0];

            //Note: "length()" String'lerde kullanilir, "length" Array'lerde kullanilir
            int son = stdAges[stdAges.length-1];

            System.out.println(ilk + son);//24

            //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
            int sum = 0;

            for(int i=0; i<stdAges.length; i++){
                sum = sum + stdAges[i];
            }
            System.out.println(sum);
//2.Yol while loop
            int top=0;
            int i=0;
            while (i<stdAges.length){
                top=top+stdAges[i];
                i++;
            }
            System.out.println(top);




// 3 yol
            int toplam = 0;
            int j = 0;
            do {
                toplam = toplam + stdAges[j];
                j++;
            } while (j < stdAges.length);
            System.out.println(toplam);
            //4.yol for each loop array ve coollectionslarda kullanilir

            int t=0;
            for (int w:stdAges){
                t=t+w;

            }
            System.out.println(t);
            String stdNames[] = new String[5];// [ 0, 0, 0, 0, 0, 0, 0 ]

            //Array nasil yazdirilir?

            //example3 string bir array olusturunuz bes tane isim yerlestir sonra isimlardeki karakter sayilarini ekrana yazdir
            stdNames[0] = "Ali";
            stdNames[1] = "Tom";
            stdNames[2] = "Veli";
            stdNames[3] = "kemal";
            stdNames[4] = "cem";
            int karakterSayilarininToplami=0;
            for (String w: stdNames){
                karakterSayilarininToplami=karakterSayilarininToplami+w.length();
            }
            System.out.println(karakterSayilarininToplami);

            System.out.println(Arrays.toString(stdNames));
           // example 4 char bir array olustur bu arraye 5 eleman bu arraydeki buyuk harfleri ekrana yazdir



            char ch[] ={'A','c','D','k','m'};
            for (char w: ch){
                if (w>='A'&&w<='Z'){
                    System.out.println(w);
                    System.out.println(Arrays.toString(ch));
                }
            }



        }

        }



