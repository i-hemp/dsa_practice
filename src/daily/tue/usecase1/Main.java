package daily.tue.usecase1;

import daily.tue.usecase1.hospital.Doctor;
import daily.tue.usecase1.hospital.Patient;
import daily.tue.usecase1.hospital.Medicine.Medicine1;

public class Main {

    public static void main(String[] args) {
        Doctor d = new Doctor("Moorthi");
        Patient p = new Patient("Ashwin");
        Medicine1 m = new Medicine1("citrizine");
        System.out.println(p.toString());
        System.out.printf("\n%s should provide %s from medical to %s\n", d.name, m.name, p.name);

        p.dieases(new int[] { 1, 2, 3, 4 });
    }

}
