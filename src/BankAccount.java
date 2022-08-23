public abstract class BankAccount {
    private long accountNumber;
    private String accountOpeningDate;
    private String modeOfOperation;
    private boolean internetBanking;
    private double totalBalance;
    private double availableBalance;
    private double rateOfIntrest;

    public BankAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking,
                       double totalBalance, double availableBalance, double rateOfIntrest) {
        this.accountNumber = accountNumber;
        this.accountOpeningDate = accountOpeningDate;
        this.modeOfOperation = modeOfOperation;
        this.internetBanking = internetBanking;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
        this.rateOfIntrest = rateOfIntrest;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getRateOfIntrest() {
        return rateOfIntrest;
    }

    public void setRateOfIntrest(double rateOfIntrest) {
        this.rateOfIntrest = rateOfIntrest;
    }

    public abstract double showAccountBalance();

    public abstract double debitBalance(double amount);

    public abstract double creditBalance(double amount);

}
