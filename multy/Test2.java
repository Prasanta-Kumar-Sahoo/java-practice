class ThreadD implements Runnable {
    Thread t;
    String tnm;

    ThreadD(String nm) {
        tnm = nm;
        t = new Thread(this, tnm);
        t.start();
    }

    public void run() {
        String tp = (String) Thread.currentThread().getName();
        if (tp.equals("one")) {
            try {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println(tp + "executing value is " + i);
                    }
                    Thread.sleep(500);

                }

            } catch (InterruptedException ir) {
                System.out.println(tp + "interrupted...");
            }
            System.out.println(tp + "terminated...");

        }

        if (tp.equals("two")) {
            try {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 != 0) {
                        System.out.println(tp + "executing value is " + i);
                    }
                    Thread.sleep(500);

                }

            } catch (InterruptedException ir) {
                System.out.println(tp + "interrupted...");
            }
            System.out.println(tp + "terminated...");

        }

    }

}

public class Test2 {
    public static void main(String[] args) {
        ThreadD t1 = new ThreadD("one");
        ThreadD t2 = new ThreadD("two");

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main executing...." + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException ir) {
            System.out.println("main interrupted...");
        }
        System.out.println("main terminated..");
    }

}
