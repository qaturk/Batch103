package day15arraysmultidimensionarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
    public static void main(String[] args) {


        //multi  dim arr kisa yoldan nasil olusturulur
        char[][] arr = {{'a', 'b'}, {'c', 'd'}, {'e'}};
        System.out.println(Arrays.deepToString(arr));
// mul dim arr de icinde a olan elemanlari yazdir

        String brr[][]= { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[]w:brr){
            for (String k:w){
                if (k.contains("a")){
                    System.out.print(k +" ");
                }
            }
        }


    }




}
