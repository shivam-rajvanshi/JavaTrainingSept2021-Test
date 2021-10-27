public class MultiThreading {

    // MultiThreading by Single Thread
    public static void main(String[] args) {

        ThreadTest t1 = new ThreadTest("Thread-1", 1, 50000);

        t1.start();

        long startTime = System.currentTimeMillis();

        try {
            t1.join();

        } catch (Exception e) {
        }

        System.out.println(ThreadTest.getPrimes());
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("------------------------------------------------------------------------");
        System.out.println("TotalTime: " + elapsedTime + " Milliseconds");

    }

}
