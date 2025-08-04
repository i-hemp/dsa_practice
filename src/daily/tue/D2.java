package daily.tue;

public class D2 {
    int a = 10;

    // static {
    // System.out.println("3");
    // // MA();
    // }
    // {
    // System.out.println("find");
    // }

    public void MA() {
        System.out.println(this.a);
        // System.out.println("meth");
    }

    public static void main(String[] args) {
        D2 d = new D2();
        d.MA();
    }

}
