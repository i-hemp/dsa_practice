package daily.thu.hybrid_maam_try;

public class Oven extends Appliance {

    public Oven(String brand) {
        super(brand);
        System.out.println(brand+" from Oven "+this.toString()+" applicance "  +super.toString());

    }

    public void baking(int degree) {
        System.out.println("Baking at " + degree + " degrees");
    }

}
