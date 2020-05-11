public class BankAccount extends Person {
    private double accountBalance;

    public BankAccount(String firstName, String lastName, int pesel,
                       double accountBalance) {
        super(firstName, lastName, pesel);
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double transfer() {
        return transfer();
    }

    public double cash() {
        return cash();
    }

    public void deposit() {
        accountBalance = getAccountBalance() + transfer();
    }

    public void maximumWithdrawalAmont() {
        if (cash() > 1000) {
            throw new TooMuchAmount();
        }
    }

    public void withdraw() {
        if (accountBalance == 0) {
            throw new LackOfAccountFunds();
        }
        accountBalance = getAccountBalance() - maximumWithdrawalAmont();
    }
}


