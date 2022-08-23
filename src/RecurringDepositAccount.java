public abstract class RecurringDepositAccount extends BankAccount{
    private int fixedAmount;
    private int noOfYears;
    private double intrestRatePerAnnum;
    private double matchuringAmount;

    public RecurringDepositAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBanking,
                                   double totalBalance, double availableBalance, double rateOfIntrest, int fixedAmount, int noOfYears, double intrestRatePerAnnum, double matchuringAmount) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBanking, totalBalance, availableBalance, rateOfIntrest);
        this.fixedAmount = fixedAmount;
        this.noOfYears = noOfYears;
        this.intrestRatePerAnnum = intrestRatePerAnnum;
        this.matchuringAmount = matchuringAmount;
    }

    public int getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(int fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(int noOfYears) {
        this.noOfYears = noOfYears;
    }

    public double getIntrestRatePerAnnum() {
        return intrestRatePerAnnum;
    }

    public void setIntrestRatePerAnnum(double intrestRatePerAnnum) {
        this.intrestRatePerAnnum = intrestRatePerAnnum;
    }

    public double getMatchuringAmount() {
        return matchuringAmount;
    }

    public void setMatchuringAmount(double matchuringAmount) {
        this.matchuringAmount = matchuringAmount;
    }

    @Override
    public String toString() {
        return fixedAmount + "," + noOfYears + ", " + intrestRatePerAnnum + "," + matchuringAmount;
    }


}
