package daily.wed.technicaltraining_e_p.que3;

public class Main {
    public static void main(String[] args) {
        EmployeeSalary e = new EmployeeSalary("1001", "Moorthi", 20000);
        System.out.println(e.toString());
        int bonusPercentage = 10;
        if (bonusPercentage > 20) {
            System.out.println("Not possible");
        } else
            e.doBonus(bonusPercentage);
    }
}
