package day15arraysmultidimensionarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //binary search()method :bu methodu kullanarakbir elemanin arrayde olup olmadigini kontrol eder
        //bu du kullanamdan once metomutlakaArrays.sort kullanilmali
        //aradiginiz elemanin indexini return eder tekrarlayan elemanlar icin kullanilmaz

        int arr[]={12,31,43,14};
        int sayi=31;
        Arrays.sort(arr);
        int idx1=Arrays.binarySearch(arr,sayi);
        System.out.println(idx1);
int sayi2=15;
int sonuc=Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);
    }
}
