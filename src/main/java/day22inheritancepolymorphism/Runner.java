package day22inheritancepolymorphism;

import day21accessmodifiersinheritage.Animal;

public class Runner {
    public static void main(String[] args) {
//Inheritance'da variable'lar secilirken Java object'in data type'ina bakar.
//Oncelikle istediginiz variable'i Object'in data type'i olan Class'da arar.
//O Class'da bulamamzsa Parent Class'lara bakar.
//Hicbir Parent Class'da bulamazsa hata verir

    Cat cat1= new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);
    Mammal cat2=new Cat();
        System.out.println(cat2.a);
        //Animal cat3 = new Cat();
       // System.out.println(cat3.a);//12
        //object olustururken object in data tipi child classlardan secilemez
        Cat cat4 = new Cat();
        cat4.eat();//Cat eat
        cat4.drink();

        Mammal cat5 = new Mammal();
        cat5.eat();// Mammal eat

        Animal catt6 = new Animal();
        catt6.eat();//Animal eat
}
}

