package daily.thu.pack1;

class Appliance {
    private String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Appliance [brand=" + brand + "]";
    }
    
}

interface Microwave {
    void baking();
}

interface Oven {
    void heating();
}

class SmartOven extends Appliance implements Microwave, Oven {
    public SmartOven(String brand) {
        super(brand);
    }

    public void baking() {
        System.out.println("baking");
    }

    public void heating() {
        System.out.println("heating");
    }
}

public class KitchenManager extends SmartOven {

    public KitchenManager(String brand) {
        super(brand);
    }

    @Override
    public String toString() {
        return super.toString();
        //  "KitchenManager []";
    }
    

}
