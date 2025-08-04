package daily.sun;

public class D10 {

    public static void main(String[] args) {

        String str = "Hello12345";
        do {
            str = str.substring(0, str.length() - 1);
        } while (!str.isEmpty() && Character.isDigit(str.charAt(str.length() - 1)));
        System.out.println(str);

    }
}
