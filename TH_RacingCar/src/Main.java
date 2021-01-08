public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 5;
    public static void main(String[] args) {
        RacingCar carA = new RacingCar("A");
        RacingCar carB = new RacingCar("B");
        RacingCar carC = new RacingCar("C");

        Thread thread1= new Thread( carA);
        Thread thread2=new Thread(carB);
        Thread thread3=new Thread(carC);

        System.out.println("DISTANCE : 100KM");
        thread1.start();
        thread2.start();
        thread3.start();



    }
}
