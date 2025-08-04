package daily.sun;

public class D9 {
public static void main(String[] args) {
    
int[] list = {1, 2, 3, 4, 5};
int left = 0, right = list.length - 1;
while (left < right) {
    int temp = list[left];
    list[left] = list[right];
    list[right] = temp;
    left++;
    right--;
}
for (int val : list) System.out.print(val + " ");
}
}
