package daily.thu.pack1;

public class Main {
    public static void main(String[] args) {
        // Child c = new Child();
        // c.display();
        KitchenManager manager = new KitchenManager("ABC");
        manager.baking();
        System.err.println(manager.toString());
    }
}
