package day07ternarystringmanipulation;

public class StringManupulations01 {
    public static void main(String[] args) {
        //String class metodlari
        //equals iki stringin ayni olup olmadigini anlamaya yarar
        //equalsignoreCase() iki tane stringin buyuk kucuk harflere bakmadan ayni oldugunu kontrol edr
        //                    bu metod boolean return eder
        //toLowerCase bir stringten tum harfleri kucuk harfe cevirir
        //                bu metod string return eder
        //toUpperCase() bir stringte tum harfleri buyuk harfe cevirir
        //                bu metod string return edr
        //charat bir stringten belli bir indeksteki karakteri almak icinn
        //            bu metod char return eder
        //length bir stringte kac tane karakter oldugunu soyler
        //               int return eder
        //contanins bir stringde bellibir karakterin veya karakterlerin olup olmadigi
        //                  boolean return eder
        // split bir stringi istedigimiz karakterden parcalar
        //                  array return eder



        // bir paswordun gecerli olup olmadigina gore kurallara gore kontrol eden kod
//en az 8 karakter icermeli
        //space olmamali
        //ilk harf m veya M
        //son karakteri ? olmali
String pwd="Manisa12?";
boolean first=pwd.length()>7;
boolean second= !pwd.contains(" ");
boolean third =pwd.charAt(0)=='M'|| pwd.charAt(0)=='m';
boolean fourth=pwd.charAt(pwd.length()-1)=='?';
        System.out.println(first && second&& third&& fourth);

    }
}
