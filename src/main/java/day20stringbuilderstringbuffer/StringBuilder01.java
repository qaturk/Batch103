package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    /*
    1)"StringBuilder" Java'da bir Class'dır
    2)"StringBuilder", String oluşturmaya yarar
    3)"String" Class varken niçin "StringBuilder"a ihtiyaç duyarız?
       Çünkü "String" Class "Immutable Class"dır, ama bazen biz "Mutable String" lere ihtiyaç duyarız.
       StringBuilder bize "Mutable String" verir.
         4)"Immutable Class" larda var olan deger degistirilmez. Siz var olan bir degeri degistirmek istediginizde
    i)Memory'de yeni bir variable yeni degerle olusturulur
    ii)Eski variable'in pointer'i  yeni variable'a dondurulur
    iii)Eger bir variable'i hicbir pionter gostermiyorsa o variable "Garbage Collector" tarafindan silinir

    "Mutable Clas'larda var olan deger degistirilebilir. orjinal deger korunmaz.

    5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
    Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin bu container'i
    kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable icin degistirdigimizde tum variable'larin
    etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java, String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in
    degerini degistirmek icin Java bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
    yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

     */

    public static void main(String[] args) {
        String str="java";
        str="super java";
        System.out.println(str);
        // string builder nasil olusturulur
        //1. yol
        StringBuilder strb=new StringBuilder("java");
        //2. yol
        // 1/durum
        StringBuilder strb2=new StringBuilder();
        strb2.append("java");
        strb2.append("is easy");
        System.out.println(strb2);
        // 2.durum
        strb2.append("learn").append("java earn").append("money");
        System.out.println(strb2);
        StringBuilder strb3=new StringBuilder();
        strb3.append("cat");
        int numOfChar=strb3.length();
        System.out.println(numOfChar);
        int capacity= strb3.capacity();
        System.out.println(capacity);
        strb3.setCharAt(2,'r');
        System.out.println(strb3);
        strb3.delete(1,2);
        System.out.println(strb3);
        strb2.reverse();
        System.out.println(strb2);
        String abc="java";
        abc=abc.replace("a","i");
        System.out.println(abc);
        //to String stringBuilder leri string e cevirir
        String stringstrb3=strb3.toString();
        System.out.println(strb3);
        StringBuilder strb4=new StringBuilder(stringstrb3);
        System.out.println(strb4);
        strb4.insert(2,"xxxx");
        System.out.println(strb4);
        strb4.insert(3,"klmnpogr",5,8);
        System.out.println(strb4);
        //a.compareTo(b) method'u i)StringBuilder'lar tamamiyla ayni ise 0 verir.
        //                        ii)"a" alfabetik sirada "b" den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini gosterir
        //                        iii)"a" alfabetik sirada "b" den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir
        StringBuilder a=new StringBuilder("Java");
        StringBuilder b=new StringBuilder("java");
        int sonuc=a.compareTo(b);
        System.out.println(sonuc);








    }
}
