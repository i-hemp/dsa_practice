package daily.mon23jun;

class InnerD1 {

    int s;

    InnerD1 nput() {
        this.s = 143243;
        return this;

    }

    void display() {
        System.out.println(s);
    }

}

public class D1 {
    public static void main(String[] args) {
        (new InnerD1()).nput().display();
        InnerD1 i = new InnerD1();
        new InnerD1().display();
        new InnerD1().display();
    }
}
