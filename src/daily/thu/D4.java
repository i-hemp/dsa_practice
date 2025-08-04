package daily.thu;

class A {
 
    public void display() {
        System.out.println("A");
    }
}

class B extends A {



    @Override
    public void display() {
 System.out.println("B");    }

}

class C extends B {


    public void display() {
      System.out.println("C");
    }

}

public class D4 {
    public static void main(String[] args) {
        C c = new C();
        c.display();
        // B b = new B(/"sidufbfdhbk");
        // b.display();
    }
}
