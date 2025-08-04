package daily.reds;

public class UseCase {

    public void name() {
        
    }
    public static void main(String[] args) {
        Ball b = new Ball("red", "rolls when throw");
        Car c = new Car("red", "can drive");
        // UseCase u = new UseCase();
        b.work();
        c.work();
        b.colorPrint();

    }
}
