import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.println("enter two numbers : ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        double c = 0;

        try {
            c = num1 / num2;
        } catch (ArithmeticException pk) {
            System.out.println(pk);
        }
        System.out.println("the division is " + c);
    }

}