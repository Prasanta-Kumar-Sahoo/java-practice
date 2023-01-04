package operation;

public class swap {
    public int swap(int a, int b) {
        System.out.println("before swaping numbers are: " + a + " and " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        // System.out.println("");
        System.out.println("after swaping numbers are: " + a + " and " + b);
        return 0;

    }
}
