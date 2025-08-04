package daily.thu.hybrid_maam_try;

public class KitchenManager extends SmartOven {

    public KitchenManager( String brand) {
        super(brand);
        System.out.println(brand + " from KitchenManager " + this.toString() + "oven" + oven.toString() + "microwave"
                + microwave.toString());

    }

}
