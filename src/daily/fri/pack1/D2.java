package daily.fri.pack1;

interface Cal {
    public double calculate(int salary);
}

interface Cal2 {
    public double bonus(int salary);

}

class Imple implements Cal, Cal2 {

    @Override
    public double bonus(int salary) {
        return salary + (salary * .10);
    }

    @Override
    public double calculate(int salary) {
        return salary * 0.40;
    }

}

class Manager implements Cal {

    @Override
    public double calculate(int salary) {
        return .40 * salary;
    }

}

class Employee implements Cal {

    @Override
    public double calculate(int salary) {
        return .20 * salary;
    }

}

public class D2 {
    public static void main(String[] args) {
        Imple imple = new Imple();
        System.out.println(imple.calculate((int) imple.bonus(100) + 2000));
        // Cal cal;
        // cal = new Employee();
        // System.out.println(cal.calculate(200000));
        // cal = new Manager();
        // System.out.println(cal.calculate(200000));

    }
}
