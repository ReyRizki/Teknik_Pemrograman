public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int a, double overdraftLimit) {
        super(a);
        this.overdraftLimit = overdraftLimit;
    }

    public double getLimit() {
        return this.overdraftLimit;
    }

    public void letter() {
        if (super.getBalance() < this.overdraftLimit)
            System.out.println("Your account (Acc " + super.getAccountNumber() + ") is overdrawn");
    }
}