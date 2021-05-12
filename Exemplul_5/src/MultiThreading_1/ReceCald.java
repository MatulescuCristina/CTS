package MultiThreading_1;

import static java.lang.Thread.sleep;


public class ReceCald implements Runnable {
    private String mesaj;
    private int timpAsteptare;

    public ReceCald(String mesaj, int timpAsteptare) {
        this.mesaj = mesaj;
        this.timpAsteptare = timpAsteptare;
    }

    @Override
    public String toString() {
        return this.mesaj;
    }

    public void run() {
        while (true) {
            try {
                System.out.println(this.toString());
                sleep(timpAsteptare);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ReceCald cald = new ReceCald("CALD", 50);
        ReceCald rece = new ReceCald("-----> rece", 20);

        new Thread(cald).start();
        new Thread(rece).start();

//        Thread t1 = new Thread(cald);
//        t1.start();
//        Thread t2 = new Thread(rece);
//        t2.start();
    }
}
