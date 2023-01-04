import java.io.InterruptedIOException;

class Thread1 implements Runnable {
    Thread t;
    String thm;

    Thread1(String nm) {
        thm = nm;
        t = new Thread(this, thm);
        t.start();
    }

    public void run() {
        String tp = (String) Thread.currentThread().getName();
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(tp + "executing value is :" + i);
                }
                Thread.sleep(50);
            }
        } catch (InterruptedException ep) {
            System.out.println(tp + "interrupted ");
        }
        System.out.println(tp + "terminated..");
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1("one");
        Thread1 t2 = new Thread1("Two");

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main executing value is :" + i);
            }
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("main interrupted ...");
        }
        System.out.println("main terminated...");

    }
}
