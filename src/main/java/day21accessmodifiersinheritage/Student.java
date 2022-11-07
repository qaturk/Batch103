package day21accessmodifiersinheritage;

public class Student {
    /*access modifier
    *public    < *protected  <    *default     <   *private
    * access modifierleri aciklayiniz
    * public olanlar her classtan kullanilir
    * protected baska package lerden ulasilamaz
    * default olanlar baska package lardan kullanilmaz ancak "child class icinde kullanilir
    * private sadece bulundugu class ta kullanlir
    *  protected String adress = "Miami";

    //default olanlar başka package'den kullanılamazlar
    String email = "th@gmail.com";

    //private olanlar sadece oluşturuldukları Class içinde kullanılabilirler.
    private String stdId = "20206517004";

     */
    public String stdname="tom hanks";//public
    protected String address="miami";//protected
    String stdEmail="th@gmail.com";//default
    private String stdId="20206517004";//private sadece yazildigi class ta kullanilir
}