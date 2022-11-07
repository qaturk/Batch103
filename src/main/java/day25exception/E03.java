package day25exception;

public class E03 {
    //bir stringte bulunan karakterlerin sayisini bulabilmek icin methot olusturunuz
    public static void main(String[] args) {
        String str = "ali";
        getNumberOfChars(str);
        String s = "";
        String a;
        getNumberOfChars(s);
        String t = null;
        getNumberOfChars(t);
    }

    public static void getNumberOfChars(String str) {
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("lenght() methodunda bir problem olustu");
        }
    }
}

