package daily.thu.eve;

class Emp {
    public String id;
    public String name;

    public Emp(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void work() {// details
        System.out.println("Emp [id=" + id + ", name=" + name + "]");
    }

}

public class Manager extends Emp {

    public String dept;

    public Manager(String id, String name, String dept) {
        super(id, name);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void manage() {
        System.out.println("managing " + dept);

    }

    public void assignTask(Worker w, String task) {
        System.out.println(getName() + " assigned " + task + " to " + w.getName() + " .");

    }
}

// public class Use {

// public static void main(String[] args) {
// Manager m = new Manager(101, "NAME", "DEPT");
// m.work();
// System.out.println(m.getName());

// }
// }