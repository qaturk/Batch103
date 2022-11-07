package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("tom");
        names.add("thomas");
        names.add("tahsin");
        names.add("trump");
        names.add("taci");
        System.out.println(names);
        List<String> cities = new ArrayList<>();
        cities.add("trump");
        cities.add("tom");
        names.removeAll(cities);
        System.out.println(names);
        System.out.println(cities);
        List<String> mynames = new ArrayList<>();
        names.add("tom");
        names.add("thomas");
        names.add("tahsin");
        boolean sonuc1 = names.containsAll(mynames);
        System.out.println(sonuc1);

       /* List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        //a listinde  shoes elemaninin ilk gorunumunu siliniz
        System.out.println(a);
        a.remove("shoes");
        System.out.println(a);
        List<String> silinecekler=new ArrayList<>();
        silinecekler.add("shoes");
        a.removeAll(silinecekler);
        System.out.println(a);*/
        //Example 1: "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        a.remove("Shoes");
        System.out.println(a);

        //Example 1: "a" listinde "Shoes" elemaninin tum gorunumlerini siliniz
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]
        //Example 3: Bir tane salary listi olusturun, eger salary 10000'den az ise %20 10000'den cok ise %10 zam yapiniz
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        for (double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else {
                salary.set(salary.indexOf(w), w * 1.1);

            }
        }
        System.out.println(salary);
        // iki listin ayni oolup olmadigini kontrol eder
        //ayni olmasi icin elemanlar ayni sirasi ayni olmali
        //1 yol

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
        int counter = 0;

        for (int i = 0; i < m.size(); i++) {
            if (m.size() != n.size()) {
                System.out.println("listeler esit degil");
                break;
            }
            if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("listler esit degil");
                break;

            }
        }
        if (counter == 0) {

        }

        //2. yol
        //2.Yol:
        boolean esitmi = m.equals(n);

        if (esitmi) {
            System.out.println("listeler esit");
        } else {
            System.out.println("Listler esit degildir");

        }
    }
}








