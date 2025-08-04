package daily.wed.technicaltraining_e_p.que3;

public class EmployeeSalary {
    private String employeeId;
    private String employeeName;
    private int salary;

    // Not necesary
    @Override
    public String toString() {
        return "EmployeeSalary [getEmployeeId()=" + getEmployeeId() + ", getEmployeeName()=" + getEmployeeName()
                + ", getSalary()=" + getSalary() + "]";
    }

    public EmployeeSalary(String employeeId, String employeeName, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void doBonus(int bonus) {
        this.salary += (bonus * 0.01 * this.salary);
        System.out.println("Total salary after bonus  : " + this.salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
