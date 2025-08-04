package daily.mon23jun;

public class D6 {
    
    public static void main(String[] args) {
        Inner6 inner6 = new Inner6();
        inner6.d6method();
    
    }
}

class Inner6 {
    private class InnerInnerD6 {

        public void innermethod() {
            System.out.println("Working............");
        }
    }

    public void d6method() {
        InnerInnerD6 id6 = new InnerInnerD6();
        id6.innermethod();
    }
}
