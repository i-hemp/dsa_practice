package daily.wed.access_specifier.pack1;

public class DataInPack1 {
    public String a = "a";
    String b = "b";
    protected String c = "c";
    private String d = "d";

    public void prints() {
        try {

            System.out.println("public [a] " + a);
            System.out.println("default [b] " + b);
            System.out.println("protected [c] " + c);
            System.out.println("private [d] " + d);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
