package operation;

public class Arith {
    public int sum(int a, int b) {
        return (a + b);
    }

    public int sub(int a, int b) {
        return (a - b);
    }

    public int mul(int a, int b) {
        return (a * b);
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("error input ..try again...");
        }
        return (a / b);
    }

}
