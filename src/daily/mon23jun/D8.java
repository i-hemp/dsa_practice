package daily.mon23jun;

public class D8 {
    int value;

    public D8(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "D8 [value=" + value + ", toString()=" + super.toString() + "]";
    }

    public D8 increase(int value) {
        this.value += value;
        System.out.println("increased: " + this);
        return this;
    }

    public D8 decrease(int value) {
        this.value -= value;
        System.out.println("Decreased: " + this);
        return this;

    }

    public static void main(String[] args) {
        D8 d = new D8(00)
        .decrease(10).increase(10)
        .decrease(10).decrease(10).decrease(10);
    }

}
