public class Main {
    public static void main(String[] args) {
        Runnable runnable = new NumberGenerator();
        Thread thread = new Thread(runnable);
        thread.start();
        Runnable runnable1 = new NumberGenerator();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
