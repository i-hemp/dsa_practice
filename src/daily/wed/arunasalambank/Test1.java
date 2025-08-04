package daily.wed.arunasalambank;

public class Test1 {
    public static void main(String[] args) {
        Bank b = new Bank(500);
        System.out.println(b.toString());
        b = new Bank(b.getBalance(), 500, 'd');
        System.out.println(b.toString());
        System.out.println(b.getBalance());
        b = new Bank(b.getBalance(), 500, 0);
        System.out.println(b.toString());
        System.out.println(b.getBalance());
    }
}
