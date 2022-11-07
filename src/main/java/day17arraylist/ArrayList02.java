package day17arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        //Example 1: Verilen bir listteki elemanlari tekrarsiz olarak yaziniz
//           [2, 3, 2, 2, 5] ==> [2, 3, 5]
        List<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        System.out.println(a);
        List<Integer> yeni=new ArrayList<>();
        for (Integer w:a){
            if (!yeni.contains(w)) {
                yeni.add(w);

            }
        }
        System.out.println(yeni);
        //example 2
        //kullanicidan bir harf aliniz harf sizdeki listin icinde var sa
        //o harfi bulunduya ceviriniz yoksa liste ekleyiniz
        //      [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
         //     [A, K, R, S]  ==> X  ==> [A, K, R, S, X]
        Scanner input = new Scanner(System.in);

        String harf = "";

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        do {
            System.out.println("Lutfen bir harf giriniz");
            harf = input.next().substring(0, 1);

            if (c.contains(harf)) {
                c.set(c.indexOf(harf), "Bulundu");
            } else if(!harf.equals("Q")){
                c.add(harf);
            }
            System.out.println(c);
        }while(!harf.equals("Q"));
    }
}




