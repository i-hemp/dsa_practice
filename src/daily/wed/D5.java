package daily.wed;

public class D5 {

    public static void main(String[] args) {
        // System.err.println(
        InnerD5 innerD52 = new InnerD5(100);
        System.out.println(innerD52.getX());
        // );
        InnerD5 innerD5 = new InnerD5(3000000);
        // innerD5.setX(20);
        System.out.println(innerD52.getX());

        // System.err.println(InnerD5.getX());
        // InnerD5.setX(InnerD5.getX() - 200);
        // System.err.println(InnerD5.getX());
    }

}

class InnerD5 {
    public static int x = 1000;

    public InnerD5(int x) {
        InnerD5.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        InnerD5.x = x;
    }

}
