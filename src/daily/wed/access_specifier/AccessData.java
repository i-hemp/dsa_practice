package daily.wed.access_specifier;

class Data {
    public int a;
    int b;
    protected int c;
    private int d;

    public static void main(String[] args) {
        Data d = new Data();

        System.out.println("public [a] " + d.a);
        System.out.println("default [b] " + d.b);
        System.out.println("protected [c] " + d.c);
        System.out.println("private [d] " + d.d);
    }

}

public class AccessData {

    public static void main(String[] args) {
        Data d = new Data();
        // PrintingClass p = new PrintingClass();
        // p.prints();
        System.out.println("public [a] " + d.a);
        System.out.println("default [b] " + d.b);
        System.out.println("protected [c] " + d.c);
        // System.out.println("private [d] " + d.d);
    }
}
