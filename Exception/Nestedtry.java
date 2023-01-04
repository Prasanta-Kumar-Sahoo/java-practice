import java.util.Scanner;

public class Nestedtry {
    public static void main(String[] args) {
        int num[] = new int[3];
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("em]nter a number : ");
            for (int i = 0; i < 3; i++) {
                num[i] = sc.nextInt();
            }
            try {
                num[2] = num[0] / num[1];
                System.out.println(num[2]);
            } catch (ArithmeticException ek) {
                System.out.println(ek);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

}
