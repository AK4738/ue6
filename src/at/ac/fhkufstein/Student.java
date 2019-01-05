package at.ac.fhkufstein;


public class Student {
    String name;
    String matrikelnr;
    String jahrgang;

    public Student(String name, String matrikelnr, String jahrgang) {
        this.name = name;
        this.matrikelnr = matrikelnr;
        this.jahrgang = jahrgang; }



    public String toString(){
        return (this.name + " " + this.matrikelnr + " " + this.jahrgang);

    }
}