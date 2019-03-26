package oop;

public class OopLecture {

    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();
//        System.out.println(p);
//        System.out.println(p2);

        p.firstName = "Patrick";
        p.lastName = "Cowan";
        p.age = 34;

        p2.firstName = "Amanda";
        p2.lastName = "Cowan";
        p2.age = 31;

        System.out.printf("%s %s is %s, and is married to %s %s who is %s.\n",p.firstName,p.lastName,p.age,p2.firstName,p2.lastName,p2.age);

        System.out.println(p == p2);

    }
}
