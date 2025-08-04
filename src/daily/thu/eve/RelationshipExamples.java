package daily.thu.eve;

public class RelationshipExamples {

    public static void main(String[] args) {

        // 1. Inheritance Example

        System.out.println("--- Inheritance (Emp & Mgr) ---");

        Emp salesExec = new Emp("Priya Sharma", "EMP-001");

        salesExec.work();

        Manager hrManager = new Manager("Rajesh Kumar", "MGR-005", "HR");

        hrManager.work();

        hrManager.manage();

        System.out.println(
                hrManager.getName() + " (ID: " + hrManager.getId() + ") manages " + hrManager.getDept() + ".");

        // 2. Association Example

        System.out.println("\n--- Association (Mgr & SwipeCard) ---");

        SwipeCard rajeshCard = new SwipeCard("SWP-DEL-1234", "Exec Area");

        System.out.println(hrManager.getName() + " uses this card:");

        rajeshCard.swipe();

        // 3. Aggregation Example (without collection)

        System.out.println("\n--- Aggregation (Mgr & Workers) ---");

        Worker worker1 = new Worker("Amit Singh", "WRK-101");

        Worker worker2 = new Worker("Neha Gupta", "WRK-102");

        Worker worker3 = new Worker("Suresh Das", "WRK-103");

        System.out.println(hrManager.getName() + " assigning tasks:");

        hrManager.assignTask(worker1, "Process hires");

        hrManager.assignTask(worker2, "Organize training");

        hrManager.assignTask(worker3, "Update records");

        System.out.println("\nWorkers can exist independently:");

        worker1.doTask("Prep daily reports.");

        // 4 & 5. Composition Example

        System.out.println("\n--- Composition (Salary & ProjectSuccess) ---");

        ProjectSuccess smartCityProject = new ProjectSuccess("Smart City Dev Phase-1", 85.5);

        Salary rajeshSalary = new Salary(75000.00, smartCityProject);

        System.out.println(hrManager.getName() + "'s Salary:");

        rajeshSalary.showSalDet();

        Manager itManager = new Manager("Deepak Singh", "MGR-007", "IT");

        ProjectSuccess digitalIndiaProject = new ProjectSuccess("Digital India Rollout", 98.0);

        Salary deepakSalary = new Salary(90000.00, digitalIndiaProject);

        System.out.println("\n" + itManager.getName() + "'s Salary:");

        deepakSalary.showSalDet();

    }

}
