package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {
        double r1=compareNumOfCharacters("java","xy");
        System.out.println(r1);
        double r2=compareNumOfCharacters(null, "xy");
        System.out.println(r2);
        double r3= compareNumOfCharacters("selenium","");
        System.out.println(r3);


    }
/*
    Java'da birbirine benzeyen üç tane keyword var:
    "final", "finally", "finalize" açıklayınız
    1)"final" bir keyword'dür. Variable, Class ve Method'lar için kullanılır.
    2)"finally" bir "code block" dur.
      "try-catch" veya sadece "try" ile kullanılır.
      "finally" code block içine yazılan kodlar her halükarda çalıştırılır.
      Mesela Database ile connection'ı kesmek her halükarda yapılması gereken bir eylemdir. Bunu "finally" ile yapabiliriz.
    3)"finalize" bir method'dur. Bu method Java tarafından data'lar imha edilmeden önce çağrılır, bu method data'ları
      imha edilecek hale getirir ve daha sonra "Garbage Collector" bu dataları imha eder.
 */






    //verilen stringiden birinin digerinin kac kati oldugunu bulan method
    public static double compareNumOfCharacters(String s,String t){
        double result=0;
                try{
                    result=s.length()/t.length();

                }catch (NullPointerException e){
                    System.out.println("lenght() methodu null ile kullanilamaz");
                }catch (ArithmeticException e){
                    System.out.println("herhangi bir sayi sifir ile bolunemez");
                }finally {
                    System.out.println("database ile connection kesildi");
                }
                return result;
    }
   /* Interview sorusu : "final", "finally", "finalize" nedir?
    final(keyword): ==> final method override edilemez.
    final variable degeri degistirilemez.
    final class child class sahibi olamaz.
            finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

    finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.*/
}
