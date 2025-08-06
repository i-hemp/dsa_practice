package d2;

@SuppressWarnings("unused")

public class D2 {

    private static String fun(int[] a, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = -1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == x) {
                System.out.println("found");
                // ans = mid;
                // b = true;
                return String.valueOf(mid + "" + true);
            } else if (a[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // System.out.println(ans);

        return "-1";
    }

    private static void de(int mat[][], int n, int m) {

    }

    int binarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

            // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    public static void main(String[] args) {
        int n = 3, m = 4,
                // target = 8,
                ans[] = new int[2],
                mat[][] = {

                        { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 19, 20, 21, 22 }
                };

        boolean b = false;
        // int val = fun(mat[1], m, target);
        // System.out.println(val);

        int row = -1;
        int target = 21;

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (mat[mid / m][mid % m] == target) {

                System.err.println(mid);
                return;
            }

            // If x greater, ignore left half
            if (mat[mid / m][mid % m] < target)
                low = mid + 1;

            // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // System.out.println(mat[2][0] +" "+ mat[2][m-1]);
        // while (low <= high) {
        // int mid = low + (high - low) / 2;

        // // Check if x is present at mid
        // if (arr[mid] == x)
        // return mid;

        // // If x greater, ignore left half
        // if (arr[mid] < x)
        // low = mid + 1;

        // // If x is smaller, ignore right half
        // else
        // high = mid - 1;
        // }

        // System.out.println(row + " bottom " + high);
        // for (int i = 0; i < n; i++) {
        // String res = fun(mat[i], m, target);
        // // System.out.println(res);
        // if (res.equals("-1")) {
        // // System.out.println(res);
        // // break;
        // continue;
        // } else {
        // System.out.println(i + " " + res.substring(0, 1));
        // break;
        // }
        // }
        // System.err.println(ans[0] + " , " + ans[1]);
    }
}
