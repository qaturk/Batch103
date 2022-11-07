package day23inheritancepolimorphism;

public class Math extends Courses {
   public void practice(){
       System.out.println("solve questions");
   }

    public Math(){
       super("second");
        System.out.println("constructor1");
    }
    public Math(int a){
    this();
        System.out.println("constructor2");
    }
}
