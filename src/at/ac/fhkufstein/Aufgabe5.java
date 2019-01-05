package at.ac.fhkufstein;

import java.util.ArrayList;


public class Aufgabe5 {
    public static void main(String[] args) {

            ArrayList<Student> student = new ArrayList<>();
            student.add(new Student("Kadir", "2651648", "SKVM13"));
            student.add(new Student("Mustafa", "26516516", "WEB18"));
            student.add(new Student("Ahmet", "6565416546", "WING12"));

            for (Student s : student) {
            System.out.println(s.toString());
        }
    }
}

