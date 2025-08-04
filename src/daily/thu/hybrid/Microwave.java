package daily.thu.hybrid;

public class Microwave extends Appliance {

    public Microwave(String brand) {
        super(brand);
    }

    public void heating(int minutes) {
        System.out.println("Heating at " + minutes + " minutes");

    }
}
