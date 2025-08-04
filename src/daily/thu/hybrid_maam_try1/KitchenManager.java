package daily.thu.hybrid_maam_try1;

public class KitchenManager extends SmartOven {
    public String brand;

     void cook(String brand) {
        display(brand);
        heating(20);
        baking(180);
    }

}
