public class Account {

    private double balance;
    private int agency;
    private int number;
    private Client owner;
    private static int total = 0;


    public Account(int agency, int number) {
        Account.total++;
        //System.out.println("O total de contas é " + Account.total);
        this.agency = agency;
        this.number = number;
        //this.balance = 100;
        //System.out.println("Estou criando uma conta" + this.number);
    }

    public void deposit(double value) {
        this.balance = this.balance + value;
    }

    public boolean withdraw(double value) {
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account destination) {
        if (this.balance >= value) {
            this.balance -= value;
            destination.deposit(value);
            return true;
        }
        return false;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        if (number <= 0) {
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.number = number;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        if (agency <= 0) {
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.agency = agency;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Client getOwner() {
        return this.owner;
    }

    public static int getTotal() {
        return Account.total;
    }

}