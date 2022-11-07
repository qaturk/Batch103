package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        int i=1;
        while (i<5){
            System.out.println("while loop");
            i++;
//while 1 den 1 e yazarsak calismaz ama do while dongusunde en az bir kere calisir
            // do yap der sarti yazdiktan sonra kontrol eder
        }
        int k=1;
        do{
            System.out.println("do-while loop");
        }while (k<1);
        k++;
        System.out.println();
//bir ondalik sayinin ondalik kismindaki rakamlari toplami
        double num = 24.5673;
        System.out.println(num);//24.5673

        //String.valueOf() methodu parantezin icine konulan data nin tipine String yapar
        String str = String.valueOf(num);
        System.out.println(str);//24.5673

        //Regex icin nokta kullandiginizda onune "\\" koyunuz. Yani nokta "\\." seklinde kullanilir
        String decimalPart = str.split("\\.")[1];


        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);//5673

        int sum = 0;

        do{

            sum = sum + decimalInt%10;

            decimalInt = decimalInt/10;

        }while(decimalInt>0);

        System.out.println(sum);




    }
    }

