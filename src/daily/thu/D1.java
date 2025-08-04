package daily.thu;

class InnerD1 {
   private int a;

   public InnerD1(int a) {
      this.a = a;
   }

   public int getA() {
      return a;
   }

   public void setA(int a) {
      this.a = a;
   }

   public void inc() {
      a += 100;
   }
}

public class D1 {
   public static void main(String[] args) {
      InnerD1 i = new InnerD1(100);

      System.out.println(i.getA());
      i.inc();
      System.out.println(i.getA());
   }
}