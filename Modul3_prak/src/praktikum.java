import java.util.Scanner;

public class praktikum extends Thread{
    
    public void run(int nilai){
        String huruf = null;
        if(nilai > 70){
            huruf = "A";
        }else if(nilai > 40 && nilai <= 70){
            huruf = "B";
        }else{
            huruf = "C";
        }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print("Convert Nilai = "+huruf);
        
            System.out.println("");
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = in.nextInt();
        praktikum p = new praktikum();
        p.run(nilai);
    }
}