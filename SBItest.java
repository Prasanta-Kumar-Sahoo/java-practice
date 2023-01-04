import operation.*;

public class SBItest {
    public static void main(String[] args) {
        SBI c1 = new SBI(3000);
        c1.checked();
        c1.deposite(2000);
        c1.checked();
        c1.withdraw(1500);
        c1.checked();
    }
}
