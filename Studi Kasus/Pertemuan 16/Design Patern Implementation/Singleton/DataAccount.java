package Singleton;

public class DataAccount {
    private static DataAccount dataAccount;
    private String accountNumber;   

    public static DataAccount getInstance(String accountNumber) {
        if (dataAccount == null) {
            dataAccount = new DataAccount(accountNumber);
        }
        return dataAccount;
    }
    
    private DataAccount(String accountNumber){
        this.accountNumber = accountNumber;
        System.out.println(accountNumber);
    }

    private DataAccount() { }
}
