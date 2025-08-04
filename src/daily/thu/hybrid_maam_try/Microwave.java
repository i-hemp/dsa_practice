package daily.thu.hybrid_maam_try;

public class Microwave extends Appliance  {

    public Microwave(String brand) {
        
        super(brand);
        System.out.println(brand+" from Micro "+this.toString()+" applicance "+super.toString());
    }

    public void heating(int minutes) {
        System.out.println("Heating at " + minutes + " minutes");

    }
}
