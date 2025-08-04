package thu030725;

public class SYstemtTimeFInd {
    public static void main(String[] args) {
        long stime = System.nanoTime();
        for (int i = 0; i < 100000000; i++) {
            System.out.print("");
        }
        long etime = System.nanoTime();
        double diff = (etime - stime) / 60_000_000_000d;
        double diff2 = (etime - stime) / 1_000_000_000.0;// maam told
        System.out.println((etime - stime) + " Nano secs");
        System.out.println("Minutes : " + diff + " " + String.format(" %.3f ", diff));
        System.out.println("Seconds : " + diff2 + " " + String.format(" %.3f ", diff2));
    }
}
