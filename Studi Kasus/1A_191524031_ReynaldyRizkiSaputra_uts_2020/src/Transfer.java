public class Transfer extends Transaction {
    private double amount;
    private Keypad keypad;
    private int targetAccountNumber;
    private final static int CANCELED = 0;

    public Transfer(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad) {
        super(userAccountNumber, atmScreen, atmBankDatabase);

        this.targetAccountNumber = 0;
        this.keypad = atmKeypad;
    }

    @Override
    public void execute() {
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        screen.displayMessage("\nPlease enter account number target: ");
        targetAccountNumber = keypad.getInput();

        amount = promptForTransferAmount();

        if (amount != CANCELED) {
            bankDatabase.credit(targetAccountNumber, amount);
            bankDatabase.credit(getAccountNumber(), amount);
            screen.displayMessageLine("Transfer success");
        }

    }

    public double promptForTransferAmount() {
        Screen screen = getScreen();

        screen.displayMessage("\nPlease enter a transfer amount in CENTS (or 0 to cancel): ");

        int input = keypad.getInput(); // receive input of deposit amount

        // check whether the user canceled or entered a valid amount
        if (input == CANCELED) {
            return CANCELED;
        } else {
            return (double) input / 100; // return dollar amount
        }
    }
}