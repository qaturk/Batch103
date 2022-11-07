package day23inheritancepolimorphism;

public class Mammal extends Animal{
    public void feedWithMilk(){
        System.out.println("Mammals feed with milk");
    }


    public Animal create() {
        return new Mammal();
    }
}
