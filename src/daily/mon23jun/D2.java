package daily.mon23jun;

public class D2 {

    public static void main(String[] args) {
        OuterD2 o = new OuterD2();
        o.sound();
        System.out.println("start");
        o.start();
    }
    public void name() {
        System.out.println("work");
    }
}

class InnerD2 {

    void sound() {
        System.out.println("zzzzzzzzzzzzzzzzzzz");
    }
}

class OuterD2 extends InnerD2 {

    @Override
    void sound() {
        super.sound();
        System.out.println("main zzzzzzzzzzzzzzzzzzzz");
    }

    InnerD2 i = new InnerD2();

    void start() {
        i.sound();
    }

}
