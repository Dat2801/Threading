public class TestThread {
    public static void main(String[] args) {
        Thread thread = new OddThread();
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread1 = new EvenThread();
        thread1.start();
    }
}
