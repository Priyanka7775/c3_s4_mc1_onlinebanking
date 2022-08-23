public class SavingAccount extends BankAccount {
    private String accountholderName;
    private String accountholderAdharId;

    public SavingAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking,
                         double totalBalance, double availableBalance, double rateOfIntrest, String accountholderName, String accountholderAdharId) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBanking, totalBalance, availableBalance, rateOfIntrest);
        this.accountholderName = accountholderName;
        this.accountholderAdharId = accountholderAdharId;
    }

    public String getAccountholderName() {
        return accountholderName;
    }

    public void setAccountholderName(String accountholderName) {
        this.accountholderName = accountholderName;
    }

    public String getAccountholderAdharId() {
        return accountholderAdharId;
    }

    public void setAccountholderAdharId(String accountholderAdharId) {
        this.accountholderAdharId = accountholderAdharId;
    }

    @Override
    public double showAccountBalance(){
        return getAvailableBalance();
    }
    @Override
    public double creditBalance(double amount){
        return getAvailableBalance()+amount;

    }

    @Override
    public double debitBalance(double amount) {
        return getAvailableBalance()-amount;
    }
}
