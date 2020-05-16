public class SavingsAccount extends Account {
    private double interest;

    public SavingsAccount(int a, double interest) {
        super(a);
        this.interest = interest;
    }

    public double getInterest() {
        return this.interest;
    }

    public void addInterest() {
        super.deposit((super.getBalance() * this.getInterest()) / 100);
    }
}