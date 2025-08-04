package d1;

//allocate minimum number of pages
public class D7 {
    public static void main(String[] args) {
        int n = 5, students = 4, a[] = { 25, 47, 28, 49, 24 };

        int min = Integer.MIN_VALUE;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            min = Math.max(min, a[i]);
            max += a[i];
        }
        if (students > a.length)
            System.out.println("Not Possible");

        // System.out.println(min + "+" + max);
        for (int pages = min; pages < max; pages++) {
            int studentCount = findStundents(a, pages);
            if (studentCount == students) {
                System.out.println("Found for pages: " + pages);
                return;
            }
        }

    }

    private static int findStundents(int[] a, int pages) {
        int studentCount = 1;
        int pagesOfCurrentStudent = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] + pagesOfCurrentStudent <= pages) {
                pagesOfCurrentStudent += a[i];
            } else {
                pagesOfCurrentStudent = a[i];
                studentCount += 1;
            }
        }
        return studentCount;
    }
}
