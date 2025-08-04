package daily.reds;

public class Car extends Imple {
    String works;

    public Car(String color, String works) {
        super(color);
        this.works = works;
        
    }

    @Override
    public void work() {
        System.out.println(this.works);

    }

}
