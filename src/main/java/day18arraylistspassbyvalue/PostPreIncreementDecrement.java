package day18arraylistspassbyvalue;

public class PostPreIncreementDecrement {
    public static void main(String[] args) {
        int a=5;
        int b=a++;
        //post increement
        System.out.println(b);//5
        System.out.println(a);//6
        //pre increement
        int c=10;
        int d=++c;
        System.out.println(d);
        System.out.println(c);
        //post decrement
        int e=20;
        int f=e--;
        System.out.println(f);//20
        System.out.println(e);//19
        //pre decrement
        int h=30;
        int i=--h;
        System.out.println(i);//29
        System.out.println(h);//29
    }
}
