package daily.wed.access_specifier;

import daily.wed.access_specifier.pack1.DataInPack1;

class InnerAccessingDataForOther {
    DataInPack1 d = new DataInPack1();

    public void prints() {
        System.out.println("public [a] " + d.a);
        System.out.println("default [b] " + d.b);
        System.out.println("protected [c] " + d.c);
        System.out.println("private [d] " + d.d);
    }

}

public class AccessingDataForOther {
    public static void main(String[] args) {
        InnerAccessingDataForOther i = new InnerAccessingDataForOther();
        i.prints();
        SamePackageClass s = new SamePackageClass();
        s.display();

    }
}
