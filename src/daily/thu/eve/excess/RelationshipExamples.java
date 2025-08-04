package daily.thu.eve.excess;

class Emp {
    String empID;
    String empName;

    public Emp(String empName, String empID) {
        this.empName = empName;
        this.empID=empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpID() {
        return empID;
    }
    public void work(){
        System.out.println(empName);
        System.out.println(empID);
    }
}
class Manager extends Emp{
    String dept;

    public Manager(String empName, String empID, String dept) {
        super(empName, empID);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }
    public void manage(){
        System.out.println("Employee Name: "+getEmpName()+"dept: "+dept);
    }
    //for Aggregation
    public void assignTask(Worker wrk, String task){
        System.out.println(getEmpName()+"assigned"+task+"to"+wrk.getName());
    }
}

class Worker{
    String name;
    String id;

    public Worker(String name, String id) {
        this.name = name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void doTask(String Task){
        System.out.printf("name: "+getName()+"WorkerId: "+getId()+"Task: "+Task);
    }
}
class ProjectSuccess{
    private String projName;
    private double compPct;

    public ProjectSuccess(String projName,double compPct) {
        this.projName = projName;
        this.compPct = compPct;

    }

    public String getProjName() {
        return projName;
    }

    public double getCompPct() {
        return compPct;
    }
    public void showStatus(){
        System.out.println("Project: "+getProjName()+"CompPct: "+getCompPct());
    }
}
class Salary {

    private double baseSal; // Monthly Base Salary

    private ProjectSuccess perfMetric; // Performance Metric

    public Salary(double baseSal, ProjectSuccess perfMetric) {

        this.baseSal = baseSal;

        this.perfMetric = perfMetric;

    }

    public double calcTotalSal() {

        double perfBonus = 0;

        if (perfMetric != null) {

            perfBonus = baseSal* 0.10 * (perfMetric.getCompPct() / 100.0);

        }

        return baseSal + perfBonus;

    }

    public void showSalDet() {

        System.out.println("Base Salary: INR " + String.format("%.2f", baseSal));

        if (perfMetric != null) {

            System.out.println("Bonus linked to Project: '" + perfMetric.getProjName() +

                    "' (" + perfMetric.getCompPct() + "%)");

        }

        System.out.println("Total Salary: INR " + String.format("%.2f", calcTotalSal()));

    }

}
class SwipeCard{
    private String cardNo;
    private String area;

    public SwipeCard(String cardNo,String area) {
        this.cardNo = cardNo;
        this.area=area;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getArea() {
        return area;
    }
    public void swipe(){
        System.out.println("Card "+cardNo+" swiped for "+area+" access.");
    }
}
public class RelationshipExamples {

    public static void main(String[] args) {

        // 1. Inheritance Example

        System.out.println("--- Inheritance (Emp & Mgr) ---");

        Emp salesExec = new Emp("Priya Sharma", "EMP-001");

        salesExec.work();

        Manager hrManager = new Manager("Rajesh Kumar", "MGR-005", "HR");

        hrManager.work();

        hrManager.manage();

        System.out.println(hrManager.getEmpName() + " (ID: " + hrManager.getEmpID() + ") manages " + hrManager.getDept() + ".");

        // 2. Association Example

        System.out.println("\n--- Association (Mgr & SwipeCard) ---");

        SwipeCard rajeshCard = new SwipeCard("SWP-DEL-1234", "Exec Area");

        System.out.println(hrManager.getEmpName() + " uses this card:");

        rajeshCard.swipe();

        // 3. Aggregation Example (without collection)

        System.out.println("\n--- Aggregation (Mgr & Workers) ---");

        Worker worker1 = new Worker(" Amit Singh ", " WRK-101 ");

        Worker worker2 = new Worker(" Neha Gupta ", " WRK-102 ");

        Worker worker3 = new Worker(" Suresh Das ", " WRK-103 ");

        System.out.println(hrManager.getEmpName() + " assigning tasks:");

        hrManager.assignTask(worker1, " Process hires ");

        hrManager.assignTask(worker2, " Organize training ");

        hrManager.assignTask(worker3, " Update records ");

        System.out.println("\nWorkers can exist independently:");

        worker1.doTask("Prep daily reports.");

        // 4 & 5. Composition Example

        System.out.println("\n--- Composition (Salary & ProjectSuccess) ---");

        ProjectSuccess smartCityProject = new ProjectSuccess("Smart City Dev Phase-1", 85.5);

        Salary rajeshSalary = new Salary(75000.00, smartCityProject);

        System.out.println(hrManager.getEmpName() + "'s Salary:");

        rajeshSalary.showSalDet();

        Manager itManager = new Manager("Deepak Singh", "MGR-007", "IT");

        ProjectSuccess digitalIndiaProject = new ProjectSuccess("Digital India Rollout", 98.0);

        Salary deepakSalary = new Salary(90000.00, digitalIndiaProject);

        System.out.println("\n" + itManager.getEmpID() + "'s Salary:");

        deepakSalary.showSalDet();

}

}