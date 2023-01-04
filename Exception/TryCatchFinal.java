import java.util.Scanner;

public class TryCatchFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int c, s;
        try {
            c = num1 / num2;
            s = 1;
        } finally {
            if (s == 0) {
                System.out.println("Division failed...");
            } else {
                System.out.println("succesfull .. ");
                System.out.println("div = " + c);
            }

        }
    }

}
