package day08stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {
       // bir stirngte space haric kackarakter old heseaplayan kod
        String str="ali okula gitti.";
       int num= str.replace(" ","").length();
        System.out.println(num);
//replace bir stringteki herhangi bir karakteri degistirmek icin kullanilir
        //bir strigteki tum a harflerini A YA CEVIR
        String s="ankaranin tasina gozlerimin yasina bak";
        String yeniS =s.replace("a","A");
        System.out.println(yeniS);


   //bir stingteki tum kara kelimelerinin yerine"*" koyunuz
   String t="kara kara dusunme ankara";
   String yeniT=t.replace("kara","*");
        System.out.println(yeniT);

   //4) :bir stirngteki tum sayilari yildiza ceviriniz
        String stdId="AC202117004";
        String yenistdId=stdId.replaceAll("[0-9]","*");
        System.out.println(yenistdId);
        //bir grup datayi ifade edn kodlara regex denir
        // 1tum rakamlar [0-9]
        //tum kucuk harfler
        //tum buyk harfler
        //sesli harfler
        //space karakteri
        //tum rakamlar tum harfler [0-9a-zA-Z]


     //5   //VERILEN BIR STRINGTE KULLANIlan noktalama isaretleri rakamlar ve space karakteri
        //haric tum karakter sayilarini bulan kod
        String u="Ali 13 yasinda,desem inanma!...";
        int sonuc=u.
                replaceAll("[0-9]","").
                replace(" ","").
                replaceAll("\\p{Punct}","").
                length();
        System.out.println(sonuc);

     //6
        // rakamlar haric [^0-9] ^isaret haric demek
        // bi
        // passwordun gecerli olup olmadigini kurallara gore test eden kod
        //1-space haric en az 8 karacter
        //2-en az bir sembol
        //en az bir buyuk harf
        //en az bir kucuk harf
        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermel
        String pwd = "B78c? K!m";

        //i)Space haric en az sekiz karakter olmali
        boolean first = pwd.replace(" ", "").length()>7;

        //ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;

        //iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        //v)En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if(pwdGecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else{
            System.out.println("Password'unuz gecerli degildir...");
        }

        //Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);
        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //           aksi halde "Normal" yazdirin.
        String v = "Kalex";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);
    }
}



