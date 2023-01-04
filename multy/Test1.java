// W.A.P to implement following using multithreading

// ->main thread(1 to 10)
// ->first child even nunber
// ->second child (even number)

class Thread1 implements Runnable {
    Thread t;
    String tnm;

    Thread1(String nm) {
        tnm = nm;
        t = new Thread(this, tnm);
        t.start();
    }

    public void run() {
        String tp = (String) Thread.currentThread().getName();
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(" executing value is " + i);
                }
                Thread.sleep(500);
            }

        } catch (InterruptedException ie) {
            System.out.println(tp + " interrupted...");
        }
        System.out.println(tp + " terminated....");
    }

}

class Thread2 implements Runnable {
    Thread t;
    String tnm;

    Thread2(String nm) {
        tnm = nm;
        t = new Thread(this, tnm);
        t.start();
    }

    public void run() {
        String tp = (String) Thread.currentThread().getName();
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(tp + " executed value is " + i);
                }
                Thread.sleep(500);
            }
        } catch (InterruptedException ie) {
            System.out.println(tp + " interrupted...");
        }
        System.out.println(tp + " terminated...");
    }

}

public class Test1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("one");
        Thread2 t2 = new Thread2("num");
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main executing value is " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException ir) {
            System.out.println("main interrupted...");
        }
        System.out.println("main terminated...");
    }

}