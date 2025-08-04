package daily.wed.arunasalambank;

public class Bank {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public Bank() {
    }

    public Bank(int balance) {
        this.balance = balance;
    }

    public Bank(int bal, int deposit, char depo) {// deposit

        if (deposit > 0 && depo == 'd')
            this.balance = bal + deposit;

    }

    public Bank(int bal, int withdraw, int with) {
        if (withdraw < this.balance) {
            this.balance = bal - withdraw;
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
