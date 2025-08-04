package daily.sun;

public class D7 {
public static void main(String[] args) {
    
int score = 85;
switch (score / 10) {
    case 10, 9 -> System.out.println("Grade A");
    case 8 -> System.out.println("Grade B");
    case 7 -> System.out.println("Grade C");
    default -> System.out.println("Grade D or F");
}
}
}
