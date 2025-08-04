package daily.fri.taskemail27;

import java.util.ArrayList;

public class D3 {
    public static void main(String[] args) {
        String[] values = { "Laptop", "Phone", "Mouse", "Phone", "Mouse", "def" };
        ArrayList<String> list = new ArrayList<>();
        for (String i : list) {
            list.add(i);
        }
        String searchElement = "de";
        for (String i : values) {
            if (i.equals(searchElement)) {
                System.out.println("Found " + i);
                return;
            }
        }
        System.out.println("Not found ");
    }
}
