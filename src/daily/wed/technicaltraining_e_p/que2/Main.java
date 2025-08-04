package daily.wed.technicaltraining_e_p.que2;

public class Main {
    public static void main(String[] args) throws Exception {
        SecureLoan s = new SecureLoan();
        s.setLoanId(1001);
        s.setBorrowerName("Moorthi");
        s.setLoanAmount(100000);
        s.setInterestRate(10);
        System.out.println("Interest : RS " + s.findInterest());
        // SecureLoan s3 = new SecureLoan(1001, "Moorthi", 10001, 10);
        // System.out.println("Interest : RS " + s3.findInterest());
        // SecureLoan s4 = new SecureLoan(1001, "Moorthi", 40000500, 10);
        // System.out.println("Interest : RS " + s4.findInterest());
        // SecureLoan s2 = new SecureLoan(1001, "Moorthi", 2000, 10);
        // System.out.println("Interest : RS " + s2.findInterest());
    }
}
