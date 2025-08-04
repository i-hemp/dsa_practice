package daily.reds;

public class Ball extends Imple {
    String works;

    public Ball(String color, String works) {
        super(color);
        this.works = works;
    }
    public void colorPrint() {
        System.out.println(color);
    }

    @Override
    public void work() {
        System.out.println(this.works);
    }

}
