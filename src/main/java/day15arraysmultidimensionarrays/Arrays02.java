package day15arraysmultidimensionarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

       // example 1 verilen bir int arraydeki en buyuk negatif ve en kkucuk pozitif elemani bul
         //math .max math.min metoduile


        int arr[]={-12,11,-5,2,-2,0};
        Arrays.sort(arr);
        int maxnegatif=arr[0];
        int minpozitif=arr[arr.length-1];
        for (int w: arr){
            if (w<0) {
                maxnegatif = Math.max(maxnegatif, w);


                }
            if (w>0){
                minpozitif=Math.min(minpozitif, w);
            }
            }
        System.out.println(maxnegatif +" and "+ minpozitif);

        }



    }

