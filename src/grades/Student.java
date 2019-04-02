package grades;


import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }



    public double getGradeAverage() {
        int total = 0;
        for (int i = 0;i < this.grades.size(); i++) {
           total += this.grades.get(i);
        } return (double) total/this.grades.size();
    }

    public static void main(String[] args) {

        Student s1 = new Student("Patrick");
        Student s2 = new Student("Amanda");

        s1.addGrade(34);

        s1.addGrade(67);

        s1.addGrade(78);

        System.out.println(s1.getGradeAverage()); //59.6
        System.out.println(s2.getGradeAverage());






    }
}
