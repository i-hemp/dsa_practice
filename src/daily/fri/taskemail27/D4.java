package daily.fri.taskemail27;

public class D4 {
    public static void main(String[] args) {
        int a[] = { 20, 30, 90, 21 };
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum+"\n"+((float)sum/a.length));
    }
}
