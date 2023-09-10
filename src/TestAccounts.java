public class TestAccounts {

    public static void main(String[] args) {

        CurrentAccount cA = new CurrentAccount(1001, 1111);
        cA.deposit(100.00);

        SavingsAccount sA = new SavingsAccount(1001, 1111);
        sA.deposit(100.0);

        System.out.println(cA.getBalance());
        System.out.println(sA.getBalance());

    }

}
