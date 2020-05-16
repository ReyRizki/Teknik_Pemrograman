public class ChangePin extends Transaction {
    private Keypad keypad;


    public ChangePin(int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase, Keypad atmKeypad) {
        super(userAccountNumber, atmScreen, atmBankDatabase);

        keypad = atmKeypad;
    }

    @Override
    public void execute() {
        BankDatabase bankDatabase = getBankDatabase();
        Account account = bankDatabase.getAccount(this.getAccountNumber());
        Screen screen = getScreen();
        int prevPin = account.getPin();
        int newPin;
        screen.displayMessage("Please enter a new PIN: ");
        newPin = keypad.getInput();

        if ((newPin != prevPin) && (newPin % 1000 != newPin % 1000))
            account.setPin(newPin);
        else
            screen.displayMessageLine("New pin is invalid");
    }
}