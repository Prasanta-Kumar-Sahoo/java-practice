import operation.*;

public class test3 {
    public static void main(String[] args) {
        Arith obj = new Arith();
        int a = obj.sum(4, 6);
        int b = obj.sub(4, 6);
        int c = obj.mul(4, 6);
        double d = obj.div(4, 6);
        System.out.println("the sum is " + a);
        System.out.println("the substraction is " + b);
        System.out.println("the multiplication is " + c);
        System.out.println("the division is " + d);

    }
}
