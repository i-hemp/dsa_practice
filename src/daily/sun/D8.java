package daily.sun;

public class D8 {
public static void main(String[] args) {
    int[] arr = {3, 4, 5, 2, 3, 6};
int index = -1;
outer:
for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            index = i;
            break outer;
        }
    }
}
System.out.println("First repeating index: " + index);
}
}
