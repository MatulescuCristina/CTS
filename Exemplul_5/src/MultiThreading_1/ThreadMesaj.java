package MultiThreading_1;


public class ThreadMesaj extends Thread {
    private String mesaj;
    private int timpAsteptare;
    private static long numar = 0;

    public ThreadMesaj(String mesaj, int timpAsteptare) {
        this.mesaj = mesaj;
        this.timpAsteptare = timpAsteptare;
    }

    public String toString() {
        return this.mesaj;
    }

    public void run() {
        for(;;) {
            try {
                System.out.println(mesaj + " : " + ++numar);
                sleep(timpAsteptare);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadMesaj t1 = new ThreadMesaj("VENIT", 300);
        ThreadMesaj t2 = new ThreadMesaj("-----> PLECAT", 100);
        ThreadMesaj t3 = new ThreadMesaj("-> NEHOTARAT", 500);

        t1.start();
        t2.start();
        t3.start();
    }
}
