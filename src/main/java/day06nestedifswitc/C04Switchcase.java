package day06nestedifswitc;

import java.util.Scanner;

public class C04Switchcase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pazartesi  :1 \t Sali:2  \t carsamba :3 \t  persembe :4 \t  cuma :5 \t cumartesi :6 \t  pazar:7 \n "+"haftanin kacinci gununde oldugunuzu giriniz");
        int kacinciGun=input.nextInt();
        if (kacinciGun <= 0 || kacinciGun > 7) {
            System.out.println("hatali veri girdiniz");
        }else {
            System.out.println("kac gun sonrasi");
            int kacGunSonrasi=input.nextInt();
            int bulunanGun=(kacGunSonrasi + kacinciGun)%7;
            switch (bulunanGun){
                case 1:
                    System.out.println(kacGunSonrasi+"gun sonra pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi+"gun sonra sali");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi+"gun sonra carsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi+"gun sonra persembe");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi+"gun sonra cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi+"gun sonra cumartesi");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi+"gun sonra pazar");
                    break;
                default:
                    System.out.println("lutfen gecerli bir gun giriniz");
            }
        }

    }
}
