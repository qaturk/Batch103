package day15arraysmultidimensionarrays;

import java.util.Arrays;

public class MultiDimensionelArrays01 {
    public static void main(String[] args) {
        //bir arrayin elemanlari array ise bu arrayler multi dimensionel array dir
        //multi dimensionel nasil olusturulur
        int arr[][]=new int[3][2];
        arr[1][0]=6;
        arr[0][0]=3;
        arr[0][1]=-4;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]=0;
        System.out.println(Arrays.deepToString(arr));
        // mul dim arraylerde elemanlardan biri nasil yazdirilir
        System.out.println(Arrays.toString(arr[1]));
        // mul dim arraylerde ic elemanlar nasil yazdirilir
        System.out.println((arr[1][0]));


        // string bir mul dim array olustur sonra toplam eleman sayisini ekraa yazdir


        String brr[][]=new String[4][3];
        brr [0][0]="A";
        brr [0][1]="B";
        brr [0][2]="C";

        brr [1][0]="D";
        brr [1][1]="E";
        brr [1][2]="F";

        brr [2][0]="G";
        brr [2][1]="H";
        brr [2][2]="J";

        brr [3][0]="K";
        brr [3][1]="L";
        brr [3][2]="M";
        System.out.println(Arrays.deepToString(brr));
        int sum=0;
        for (String[] w:brr){
        sum=sum+ w.length;

        }
        System.out.println(sum);
    }
}
