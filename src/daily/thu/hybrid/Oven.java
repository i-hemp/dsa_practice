package daily.thu.hybrid;

public class Oven extends Appliance {

    public Oven(String brand) {
        super(brand);
    }

    public void baking(int degree) {
        System.out.println("Baking at " + degree + " degrees");
    }

}
