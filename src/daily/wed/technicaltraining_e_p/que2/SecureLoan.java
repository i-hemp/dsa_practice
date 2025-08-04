package daily.wed.technicaltraining_e_p.que2;

public class SecureLoan {

    private int loanId;
    private String borrowerName;
    private int loanAmount;
    private int interestRate;

    public SecureLoan() {
    }

    public SecureLoan(int loanId, String borrowerName, int loanAmount, int interestRate) throws Exception {

        if (loanAmount <= 10000) {
            throw new Exception("Loan amount must be above $ 10000");
        }
        this.loanAmount = loanAmount;

        this.loanId = loanId;
        this.borrowerName = borrowerName;
        this.interestRate = interestRate;
    }

    public int findInterest() {
        return (int) ((double) loanAmount * (double) interestRate * 0.01);
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public int getLoanAmount() {

        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) throws Exception {
        if (loanAmount <= 10000) {
            throw new Exception("Loan amount must be above $ 10000");
        }
        this.loanAmount = loanAmount;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

}
