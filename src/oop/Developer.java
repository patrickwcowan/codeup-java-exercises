package oop;

class Developer extends Employee {
    public String work() {
        return "writing code";
    }

    public String codeSetter() {
        return "learning to code";
    }

    public Developer(String name, String department) {
        super(name, department);
    }

    public static void main(String[] args) {

        Employee e1 = new Developer("Patrick","Java");
        Employee e2 = new Manager("John","Javascript");
        Employee e3 = new Developer("Jason","HR");



        System.out.println(e1.work());
        System.out.println(e1.getName());
        System.out.println(e1.getDepartment());

        System.out.println(e2.work());
        System.out.println(e2.getName());
        System.out.println(e2.getDepartment());

        System.out.println(e3.work());
        System.out.println(e3.getName());
        System.out.println(e3.getDepartment());



    }

}
