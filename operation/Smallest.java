package operation;

import javax.lang.model.util.ElementScanner6;

public class Smallest {
    public int implement(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else
            return c;
    }

}
