public class Bank {
    private SavingsAccount[] sAccounts;
    private CurrentAccount[] cAccounts;
    private double dividend;
    private int N;

    public Bank(int accounts, double dividend) {
        this.N = accounts;
        sAccounts = new SavingsAccount[accounts];
        cAccounts = new CurrentAccount[accounts];
        this.dividend = dividend;
    }

    public int getN() {
        return this.N;
    }

    private double getDividend() {
        return this.dividend;
    }

    public void openSAccount(int index, int a, double interest) {
        this.sAccounts[index] = new SavingsAccount(a, interest);
    }

    public void openCAccount(int index, int a, double overdraftLimit) {
        this.cAccounts[index] = new CurrentAccount(a, overdraftLimit);
    }

    public void sUpdate() {
        for (int i = 0; i < sAccounts.length; i++)
            sAccounts[i].addInterest();
    }

    public void cUpdate() {
        for (int i = 0; i < cAccounts.length; i++)
            cAccounts[i].letter();
    }

    public void payDividend() {
        for (int i = 0; i < this.getN(); i++) {
            cAccounts[i].deposit(this.getDividend());
            sAccounts[i].deposit(this.getDividend());
        }
    }

    public void showSAccount(int index) {
        sAccounts[index].print();
    }

    public void showCAccount(int index) {
        cAccounts[index].print();
    }

    public void showAccounts() {
        for (int i = 0; i < this.getN(); i++)
            sAccounts[i].print();
        
        for (int i = 0; i < this.getN(); i++)
            cAccounts[i].print();
    }

    public void closeSAccount(int index) {
        sAccounts[index] = null;
    }

    public void closeCAccount(int index) {
        cAccounts[index] = null;
    }
}