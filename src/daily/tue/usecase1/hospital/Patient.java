package daily.tue.usecase1.hospital;

import java.util.Arrays;

public class Patient {
    public String name;

    public void dieases(int a[]) {
        System.out.println(Arrays.toString(a));
    }
    // Doctor d = new Doctor("name1");

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient [name=" + name + "]";
    }

}
