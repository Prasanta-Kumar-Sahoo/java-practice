import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int num[] = new int[5];
            num[5] = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception occure");
        } catch (ArrayIndexOutOfBoundsException pk) {
            System.out.println("ArrayIndexOutOfBounds Exception occures...");
        } catch (Exception e) {
            System.out.println("parent exception occures....");
        }
        // System.out.println("rest of the code...");
    }
}
