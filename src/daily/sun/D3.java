package daily.sun;

import java.util.Scanner;

public class D3 {
public static void main(String[] args) {
    

int attempts = 0;
int input;
Scanner sc = new Scanner(System.in);
do {
    System.out.print("Enter a positive integer: ");
    input = sc.nextInt();
    attempts++;
} while (input <= 0);
System.out.println("Attempts: " + attempts);
}
}
