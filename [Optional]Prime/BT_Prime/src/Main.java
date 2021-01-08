public class Main {
    public static void main(String[] args) {
        Runnable runnable = new OptimizedPrimeFactorization();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
