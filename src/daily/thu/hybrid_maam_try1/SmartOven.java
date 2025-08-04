package daily.thu.hybrid_maam_try1;

public class SmartOven implements Microwave,Oven{

    @Override
    public void display(String brand) {
        System.out.println("Brand : "+brand);
    }

    @Override
    public void baking(int degree) {
        System.out.println("Baking at " + degree + " degrees");
    }

    @Override
    public void heating(int minutes)  {
        System.out.println("Heating at " + minutes + " minutes");

    }

}
