package day06nestedifswitc;

import java.util.Scanner;

public class C05switchcase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen harflerden birini giriniz: \n A\tB\tC");
        char harf=input.next().toUpperCase().charAt(0);
        switch (harf){
            case 'A':
                System.out.println("java kolay");
                break;
            case 'B':
                System.out.println("java eglenceli");
                break;
            case 'C':
                System.out.println("calismaliyim");
                break;
            default:
                System.out.println("gecerli bir harf giriniz");
        }

    }
}
