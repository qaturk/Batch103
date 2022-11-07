package day07_stringmanipulations;

public class C08_StringManipulations {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın
        String mailadres="seref@gmail.com";
        String ararnanMetin="gmail.com";

        if (!mailadres.contains(ararnanMetin)) {
            System.out.println("lutfen gecerli mail girin");
        } else if (mailadres.endsWith(ararnanMetin)) {
            System.out.println("email adresiniz kaydedildi");
        } else System.out.println("lutfen adresinizi kontrol edin");

        }
         /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/
    }


