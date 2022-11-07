package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        String a= "Java kolaydir";
        boolean b=a.startsWith("kola");
        System.out.println(b);
        String c=a.replaceFirst("a","*");
        System.out.println(c);
        String d=a.concat("anladin mi");
        System.out.println(d);
//concat iki stringi birbirine baglar
        //concat iki turlu yapilabilir "+ ile" veya "concat()" ile
        String e="    tom Hanks    ";
        System.out.println(e);
        String f=e.trim();
        System.out.println(f);
        // trim metodu bir stringin space karakterlerini siler aradaki space karakterlerine dokunmaz
        String h="Kava";
        String i="Java";
        int k=h.compareTo(i);
        System.out.println(k);
//h.compareTo kod iki tane stringi alfabetik olarak karsilastirir
        //buyuk harf kucuk harfe diuyarli
        // kodda h nin alfabetik sirasindan i nin alfabetik sirasi cikarilir
        String n=a.repeat(5);
        System.out.println(n);
//a.repeat(5) kodu a stringini 5 kere yanyana yazdirir
        //windows kullanicilari ctrl basili tutun maus ile metodun uzerine tiklayin
    }
}
