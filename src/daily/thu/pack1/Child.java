package daily.thu.pack1;
class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

interface A {
    void show();
}

interface B {
    void display();
}

public class Child extends Parent implements A, B {
    public void show() {
        System.out.println("Show from A");
    }

    public void display() {
        System.out.println("Display from B");
    }
}
