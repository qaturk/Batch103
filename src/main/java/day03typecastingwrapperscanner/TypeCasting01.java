package day03typecastingwrapperscanner;

public class TypeCasting01 {
    //bir numeric data tipini diger numeric data tipine cevimek
    //byte short int long float double
    public static void main(String[] args) {
        byte age = 23;
                int newAge = age;
                long population = 1234;
                        int newpopulation = (int)population;
     // example short u double a cevir
     short fiyat = 20;
     float newFiyat = fiyat;
     double sicaklik = 30.5;
     byte newSicaklik = (byte)sicaklik;
     System.out.println(newSicaklik);
     int number = 515;
     byte newNumber =(byte)number;
     System.out.println(newNumber);//mod256 byte in sinirina gore kalani verir
        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);

    }
}
