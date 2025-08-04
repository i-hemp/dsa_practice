package daily.mon23jun;

import java.io.Console;

// val100
public class D7 {

    public static void main(String[] args) {
        InnerD7 i = InnerD7.getInstance();
        InnerD7 i1 = InnerD7.getInstance();
        InnerD7 i3 = new InnerD7(10);
        // i3.setValue(20);
        System.out.println(i);
        i.setValue(1000);
        System.out.println(i1.getValue());
        i3.setValue(20);
        System.out.println(i3.getValue());
        i1.setValue(10283123);
        System.out.println(i.getValue());
// Console c = Console.class.

    }
}

class InnerD7 {

    int value;

    public InnerD7(int value) {
        super();
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private static InnerD7 i = new InnerD7(10);

    public void notStatic() {
        System.out.println("not static");
    }

    public static InnerD7 getInstance() {
        return i;
    }
}
