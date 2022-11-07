package day25exception;

public class E02 {
    public static void main(String[] args) {
        String arr[]={"ali","can","veli","han"};
        getElementFromArray(arr,2);//ali
        getElementFromArray(arr,0);//veli
        getElementFromArray(arr,4);//ArrayIndexOutOfBoundsException: Index 4 out of
    }
    //bir string array den index girerek eleman elde edebilmek icin bir method olusturun
    public static void getElementFromArray(String arr[],int idx){
        try{
        System.out.println(arr[idx]);

    }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index te bir problem meydana geldi"+e.getMessage());
            //Array index te bir problem meydana geldiIndex 4 out of bounds for length 4
            System.err.println("array index te bir problem yasandi");

        }
}}
