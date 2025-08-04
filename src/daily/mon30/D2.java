package daily.mon30;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class D2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        int arr[] = { 1, 2, 3, 4, 5 };
        int sums = 0;
        OptionalInt aes = Arrays.stream(arr).reduce((x, y) -> x + y);
        // int aes = Arrays.stream(arr).reduce(sums, (x, y) -> x + y);
        System.out.println(aes.getAsInt());
        // System.out.println(aes);
        // sum will be 15
    }
}
