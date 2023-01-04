package operation;

interface bank {
    public void deposite(int a);

    public void withdraw(int b);

    public void checked();
}

public class SBI implements bank {
    int balance = 0;

    public SBI(int a) {
        balance = a;
    }

    public void deposite(int a) {
        balance += a;
        System.out.println("the amount" + a + "is deposited on your account...");
    }

    public void withdraw(int b) {
        if (balance < b) {
            System.out.println("you Don't have any suffecient balance ... ");
        } else {
            balance -= b;
            System.out.println("the amount" + b + "is withdral on your account...");
        }
    }

    public void checked() {
        System.out.println("the balace is" + balance);
    }

}