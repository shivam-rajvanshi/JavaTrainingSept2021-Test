public class MultiThreading2 {

    // MultiThreading by 2 Threads

    public static void main(String[] args) {

        ThreadTest t1 = new ThreadTest("Thread-1", 1, 25000);
        ThreadTest t2 = new ThreadTest("Thread-2", 25001, 50000);

        t1.start();
        t2.start();

        long startTime = System.currentTimeMillis();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }

        System.out.println(ThreadTest.getPrimes());
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("------------------------------------------------------------------------");
        System.out.println("TotalTime: " + elapsedTime + " Milliseconds");

    }

}
