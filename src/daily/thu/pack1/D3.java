package daily.thu.pack1;

interface A {

    public void dis1();
}

interface B {

    public void dis();
}

class C implements A, B {

    @Override
    public void dis() {
        System.out.println("in C");
    }

    @Override
    public void dis1() {
               System.out.println("in C by dis1");

    }

    @Override
    public String toString() {
        return "C []";
    }

}

public class D3 {
    public static void main(String[] args) {
        C i = new C();
        // i.dis();
        // i.dis1();
        i.dis();
    }

}
