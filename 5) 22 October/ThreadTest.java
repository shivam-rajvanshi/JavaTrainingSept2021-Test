import java.util.ArrayList;

public class ThreadTest extends Thread {

    private String ThreadName;
    private int start, end;
    private static ArrayList<Integer> primes = new ArrayList<>();

    public ThreadTest(String ThreadName, int start, int end) {
        super(ThreadName);
        this.start = start;
        this.end = end;
        this.ThreadName = ThreadName;
    }

    public static ArrayList<Integer> getPrimes() {
        return ThreadTest.primes;
    }

    public void run() {

        for (int i = this.start; i <= this.end; i++) {
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    temp++;
                }
            }
            if (temp == 2) {
                this.primes.add(i);
            }
        }

    }

}
