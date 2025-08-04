package daily.thu.hybrid;

public class SmartOven {
    public String brand;
    public Oven oven;
    public Microwave microwave;

    public SmartOven(String brand) {
        this.brand = brand;
        this.oven = new Oven(this.brand);
        this.microwave = new Microwave(this.brand);
    }

}
