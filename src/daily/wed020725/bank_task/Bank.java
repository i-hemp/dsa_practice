package daily.wed020725.bank_task;

import java.util.HashMap;

public class Bank implements BankImplement {

    private HashMap<Integer, Account> map = new HashMap<>();

    {

        Account a = new Account(1001, "Moorthi", "1001", 1001, "m@gmail.com");
        Account a2 = new Account(1021, "XYZ", "1021", 1021, "xyz@gmail.com");
        try {
            addAccount(a);
            addAccount(a2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Bank(Account acc) throws Exception {
        addAccount(acc);
    }

    public Bank() {
    }

    @Override
    public void showBalance(int accountNumber) {
        System.out.println("Current balance : " + map.get(accountNumber).getBalance());
    }

    @Override
    public void withdraw(int money, int accountNumber) throws Exception {
        Account a = this.map.get(accountNumber);
        if (money < a.getBalance())
            a.setBalance(a.getBalance() - money);
        else {
            throw new Exception("Not possible : Account balance is low");
        }
    }

    @Override
    public void deposit(int money, int accountNumber) throws Exception {
        Account a = this.map.get(accountNumber);
        a.setBalance(a.getBalance() + money);

    }

    @Override
    public void addAccount(Account acc) throws Exception {
        if (!map.containsKey(acc.accountNumber))
            this.map.put(acc.accountNumber, acc);
        else {
            throw new Exception("Not Possible : Account Number already registered");
        }
    }

    @Override
    public void showAccounts() {
        for (Integer accNumber : map.keySet()) {
            System.out.println(map.get(accNumber).toString());
        }
    }

    @Override
    public void showAccounts(int order) {
        for (Integer accNumber : map.keySet()) {
            System.out.println(order++ + " . " + map.get(accNumber).toString());
        }
    }

    public HashMap<Integer, Account> getAccountsMap() {
        return map;
    }

}

class Account {
    public boolean verify(String newemail) {
        if (!newemail.contains("@") || !newemail.contains(".com"))
            return false;
        return true;
    }

    public int accountNumber;
    public String name;
    private String password;
    private int balance;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /* not popssible */
    public Account(int accountNumber, String name, String password, int balance, String email) {
        this.accountNumber = accountNumber;
        this.name = name.toLowerCase();
        this.password = password;
        this.balance = balance;
        this.email = email.toLowerCase();
    }

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

// public class UseBank {
// public static void main(String[] args) throws Exception {
// Account a = new Account(1001, "Moorthi");
// a.setPassword("8888");
// a.setBalance(1001);
// Bank b = new Bank();
// Account a2 = new Account(1021, "Moorthi");
// b.addAccount(a);
// b.addAccount(a2);
// b.includedAccounts();
// b.withdraw(200, a.accountNumber);
// b.showBalance(a.accountNumber);
// b.deposit(200, a.accountNumber);
// b.showBalance(a.accountNumber);

// // System.out.println(b.map.get(a.accountNumber).getBalance());
// }

// }