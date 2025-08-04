package daily.sun;

public class D6 {
public static void main(String[] args) {
    
int x = -2; // −2 ≤ x ≤ 2
switch (x + 2) {
    case 0 -> System.out.println("Negative");
    case 2 -> System.out.println("Positive");
    case 1 -> System.out.println("Zero");
}
}
}
