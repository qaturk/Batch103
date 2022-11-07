package day21accessmodifiersinheritage;

public class AnimalRunner {
/*
    1)"Inheritance" sayesinde
        i)Code tekrarlarından kurtuluruz.
        ii)Code tamiri(maintenance) kolay olur.
        iii)Child Class'ları daha atomik yapmış oluruz.

    2)Bir Class'ı başka bir class'ın Child Class'ı yapmak için
      "extends" keyword kullanılır. ilk yazılan Class Child, ikinci
      yazılan Class parent olur.

    3)Child Class object'leri Parent Class'dan method ve variable'ları kullanabilirler.

    4)Parent Class object'leri Child Class'dan methodv e variable'ları kullanamazlar

    5)Object Class her Class'ın Parent'ıdır.
        Java'da Object Class hariç her class'ın parent'ı vardır
        Java'da parent'ı olmayan tek class Object Class'dır.
        6)private method ve varablelar child classlartarafindan kullanilamaz
        default method ve variable lar child classlar arafindan kullanilamaz
        * child class lar tarfindan kullanilabilir demek inherit edilebilir demek
        7)4 tip inheritance vardır
        i)Multilevel Inheritance: Java bunu kabul eder.
        ii)Hierarchical Inheritance: Bir parent için çoklu child, Java bunu kabul eder.
        iii)Multiple Inheritance: Bir child'a çoklu parent, Java bunu desteklemez.
        iv)Single Inheritance: Bir Child Class için bir Parent Class, Java bunu destekler.
 */


    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.eat();
        c1.drink();
        c1.meow();
        Dog d1= new Dog();
        d1.bark();
        d1.drink();
        d1.eat();

    }
}
