package daily.wed020725.bank_task;

public interface BankImplement {

    void showBalance(int accountNumber);

    void withdraw(int money, int accountNumber) throws Exception;

    void deposit(int money, int accountNumber) throws Exception;

    void addAccount(Account acc) throws Exception;
    void showAccounts(int order) ;

    void showAccounts();

}