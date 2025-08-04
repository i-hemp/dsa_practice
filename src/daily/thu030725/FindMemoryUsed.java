package thu030725;

public class FindMemoryUsed {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.gc();
        long beforeMem = r.totalMemory() - r.freeMemory();
        System.out.println("Used before : " + beforeMem);
        int a[] = new int[1000000];
        // Arrays.fill(a, 0);
        long afterMem = r.totalMemory() - r.freeMemory();
        System.out.println("Used after : " + afterMem);

        System.out.println("Diff : " + (afterMem - beforeMem));
    }
}
