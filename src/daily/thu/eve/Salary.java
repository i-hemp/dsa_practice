package daily.thu.eve;

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

            perfBonus = baseSal * 0.10f *  perfMetric.getCompPct() / 100.0;

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


