package daily.mon23jun;

public class D9 {
    public static void main(String[] args) {
        InnerD9 d9 = new InnerD9();
        
    }
}

class InnerD9 {
    public InnerD9() {
        this("ram");
    }

    public InnerD9(String string) {
        this(1, 2);
        System.out.println(string);
    }

    public InnerD9(int i, int j) {
        System.out.println(i + " " + j);
    }
}
