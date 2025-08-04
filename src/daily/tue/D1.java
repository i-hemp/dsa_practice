package daily.tue;

import java.util.Scanner;

class InnerD1 {
    static int ei = 100;
    static {
        System.out.println("INner 1");
    }
}

public class D1 {
    static int a = 10;
    static {
        System.out.println("MAIn");
      
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    }
    // { 
    //     // System.out.println("mAim");
    //     System.out.println(InnerD1.ei);

    // }

}
