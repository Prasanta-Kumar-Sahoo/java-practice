package operation;

public class Fectorial {
    public int calculation(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("the factorial is " + fact);
        return fact;

    }

}
