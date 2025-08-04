package daily.wed.access_specifier;

public class SamePackageClass {
    Data d = new Data();



    public void display() {
        System.out.println("public [a] " + d.a);
        System.out.println("default [b] " + d.b);
        System.out.println("protected [c] " + d.c);
        // System.out.println("private [d] " + d.d);
    }

}
