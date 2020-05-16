public class Driver {
    public static void main(String[] args) {
        Bank rupt = new Bank(5, 20);

        for (int i = 0; i < rupt.getN(); i++)
        {
            rupt.openSAccount(i, i+1, 1);
            rupt.openCAccount(i, i+6, 50);
        }

        rupt.payDividend();

        rupt.sUpdate();
        rupt.cUpdate();

        rupt.showAccounts();

        rupt.closeSAccount(0);
        rupt.closeSAccount(3);
    }
}