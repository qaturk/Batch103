package day24statickeywordencapsulation;

public class Student {
    //encapsulation(kapsullemek) data hiding(gizlemek)
    //data yi dis etkenlerden korumak icin
    //access modifierini private yaparak gizleriz
    // data yi gizledikten sonra baska classlardan okumak istersen ne yaparsin
    //get methodlar(getter) olusturarak gizledigimiz data lari okunabilir hale getiririz
    // data yi baska classlardan degistirmek icin set methodlar(setter) olusturarak degistirebiliriz
    // variable retuurn type ne ise get methodunki ayni olmaliidir
    //get methodlari isimlendirirken get+variablename variable in data tipi boolean ise is+variable olur



  public String stdName="tom hanks";
  private String stdId="th202201";
  private double gpa=3.8;
  private boolean retired= false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;

    }
}
