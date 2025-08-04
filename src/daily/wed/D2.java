package daily.wed;

public class D2 {

    public static void main(String[] args) {
        Emp e = new Emp();
        Emp e2 = new Emp("Moorthi", 20, 10000, "Student");
        System.out.println(e2.toString());
    }
}

class Emp {
    public String name;
    public int age;
    public int salary;
    public String designation;

    public Emp() {
        System.out.println("Default Constructor");
    }

    public Emp(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Emp(String name, int age, int salary, String designation) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Emp [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + "]";
    }

}
