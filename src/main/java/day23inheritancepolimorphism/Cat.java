package day23inheritancepolimorphism;



public class Cat extends Mammal {
    public void meow(){
        System.out.println("Cat meow");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }//asagidaki override
    public Mammal create(){
        return new Mammal();

    }

    /*
    1)Override yaparken "method'un body"si değiştirilir.
    2)Override yaparken ASLA method signature(isim ve parametre) değiştirilemez
    3)Override yaparken "inheritance" olmak zorundadır.
    4)Override yaparken "Access Modifier" lar belli kurallara göre farklılaştırılabilirler
        i)"private" methodlar override edilemezler
        ii)Child Class'taki "override edilen" method'un access modifier'ı Parent Class'taki
           method'un Access Modifier'ı ile aynı veya geniş olmalıdır
           Note: Child Class'taki method'un access modifier'ı daha dar olamaz.
        iii)Default method'lar aynı package içindeyse override edilebilirler
            farklı package'dewn override edilemezler
     5-return type void ise override  edildiginde baska return type kullanilamaz
     6-Parent Class'daki methodun "return type" i Parent Class ise "return type" ?
      7)Parent Class'daki methodun "return type" i Wrapper Class ise "return type" degistirilemez.
         8)Parent Class'daki methodun "return type" i Parent Class ise "return type" child'lardan biri olabilir.
           Note: Child Class'daki return type Parent Class'dakinden genis olamaz.
           Note: Aralarinda "Parent Child" iliskisi olmayan Class'lar Overriding'de Return Type degisiminde
                 kullanilamazlar. Mesela "Short", "Integer"dan kucuktur, fakat ararlarinda "Parent Child" iliskisi
                 olmadigindan "Integer" yerine "Short" kullanamazsiniz.
           Note: Child daki method'un Return Type'indan Parent'taki method'un Return Type'ina gidiste
                 "IS-A" Relationship olmali.
           Note: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.
            9)Child<Parent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
                      HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
    10)"final" method'lar Override edilemezler, çünkü "Overriding"de method body değiştirilir.
       "final" method body değiştirilmesine müsaade etmez.
    11) Polymorphism = Overloading + Overriding
        Note: Polymorphism nedir derlerse, Overloading + Overriding'i anlatın.
    12)Overloading ile Overriding arasındaki farklar nelerdir?
          i)Overloading için "inheritance" gerekmez, fakat Overriding için gerekir.
          ii)"private" method'lar Overload edilebilir. Override edilemezler.
          iii)"final" method'lar Overload edilebilir, Override edilemezler.
          iv)"Overloading" static polymorphism olarak, "Overriding" dynamic polymorphism olarak adlandırılır.
          v)v)"Overloading" de method signature değişir ama "Overriding" de method signature'a dokunulmaz.
 */





}
