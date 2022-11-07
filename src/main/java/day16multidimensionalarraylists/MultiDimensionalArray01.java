package day16multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    //array veya collection var sa for each loop kullan
    //bir int mul dim array olutur
    //arraydeki tum elemanlarin toplami
    public static void main(String[] args) {
        int arr[][]={{2,5,1},{32,75},{13,21,43,56}};
        int sum=0;
        for (int[]w:arr){
            for (int k:w){
                sum=sum+k;
            }
        }
        System.out.println(sum);
       // exammple bir mul dim arrayi normal arraya cevir
        int brr[][]={{2,5,1},{32,75},{13,21,43,56}};
        int toplam=0;
        for (int[]w:brr){
            toplam=toplam+w.length;
        }
        System.out.println(toplam);
        int idx=0;
        int crr[]=new int[toplam];
        for (int[] w:brr){
            for (int k:w){
                crr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));



        }
    }

