package oop;

class Manager extends Employee {


    public String work() {
        return "holding meetings";
    }


    public Manager(String name, String department) {
        super(name,department);
    }

    public String codeSetter() {
        return "teaching to code";
    }


}

