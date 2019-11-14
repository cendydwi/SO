public class contoh {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable(){
        @Override
        public void run(){
            System.out.println("Sedang berjalan.....");
        }
    });
        t.start();
    }
}