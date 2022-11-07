package day22inheritancepolymorphism;

public class HondaAccord extends Honda{
    //1- class olusturdugunuzda java otom olarak gorunmez bir  constructor verir
    // cunku java class in bir kalip oldugunu  ve object olusturmak icin yaratildigini
    //ve object olusturmak icin constructur in sart oldugunu bilir
    //2- java nin otomatik olusturuldugunu bu gorunmez constructur a default constructur denir
    // 3-kendiniz herhangi bir constructur olusturdugunuzda java default constructoru siler
    //4-bir clas da birden fazla constructor  olabilir.Fakat bu constructor'larin parametre'leri farkli olmalidir.
    //5- this keyword bu class anlamindadir"this.price" demek bu classtaki price demektir
    //"this.price syntax i constructor larin icinde kullanilir
    //6-constructor kullanarak variable uzerinde yaptiginiz degisimler sadece object uzerinde ki variable degerlerini
    // degistirir classtaki variable degerlerini degistirmez
    public int price;
    public int year;
    public String make;
    public String model;
    public HondaAccord(){

    }
    public HondaAccord(int price){
        this.price=price;

    }
    public HondaAccord(int price,int year){

        this.price=price;
        this.year= year;
        System.out.println("honda accord constructor");



    }
    public HondaAccord(int price, int year, String make, String model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;

    }
}
