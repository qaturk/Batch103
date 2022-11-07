package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class arrays01 {
    //arraylarin icine sadece primiitiv data tipleri ve reference lar yerlestirilir
    public static void main(String[] args) {
        String str[]=new String[4];
        str[0]="java";
        str[1]="did";
        str[2]="suprise";
        String arr[] = {"jane","mark","chris","tom", "ali"};
        for (String w:arr){
            System.out.print(w+"");
            if (w.equals("tom")){
                break;

            }
          /*  String brr[] = {"jane","mark","chris","tom", "ali"};
            for (String w : brr){
                if (w.equals("jane")|| w.equals("tom"));
                continue;
            }
            System.out.println(w +"");*/

        }
        System.out.println();
        //kullanici ile array olusturma icine data ekleme
        Scanner input=new Scanner(System.in);
        System.out.println("kac ogrenci ismi gireceksiniz");
        int numOfStudents= input.nextInt();
        String names[]=new String[numOfStudents];
        System.out.println("girisi sonlalandirmak icin Q devametmek icin bir tusa basiniz");
        for (int i=1;i<numOfStudents;i++){
            System.out.println("lutfen "+i+" ogrenci ismini giriniz");
String stdName=input.next();



            if (stdName.equalsIgnoreCase("q")){
    break;
            }
            names[i-1]= stdName;
        }
        System.out.println(Arrays.toString(names));

    }
}
