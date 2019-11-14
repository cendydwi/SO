public class ImplementsRunnable implements Runnable {
    @Override
    public void run(){
        System.out.print("Sedang berjalan.....");
    }
    public static void main(String[] args) {
        ImplementsRunnable m1 = new ImplementsRunnable ();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}