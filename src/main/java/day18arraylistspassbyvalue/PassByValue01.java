package day18arraylistspassbyvalue;


public class PassByValue01 {
    public static void main(String[] args) {
        /*
1)Java, variable'ların orijinal değerlerini korumak ister.
2)Variable metotlar içinde kullanıldığında, Java metodun içine
orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
orijinal değer korunmuş olur. Bu sisteme PassByValoue denir.pass by value degerin kopyasini yolla demek


 */
        int x=5;
        System.out.println(x);
        change(x);
        System.out.println(x);
        int ucret=100;
        indirim(ucret);

        System.out.println(ucret);

    }
    public static void change(int a){
        System.out.println(a*3);
    }
    public static int indirim(int gomlekucreti){
        return gomlekucreti-10;

    }

}
