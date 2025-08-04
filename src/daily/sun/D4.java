package daily.sun;

public class D4 {
public static void main(String[] args) {
    
int[] A = {10, 20, 30, 40, 50};
int sum = 0;
for (int i = 0; i < A.length; i++) {
    if (i % 2 != 0) continue;
    sum += A[i];
}
System.out.println("Sum: " + sum);
}
}
