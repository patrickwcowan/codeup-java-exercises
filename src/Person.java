public class Person {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return ("Hello " + name);
    }

    public Person(String name) {
        this.name = name;
    }



    public static void main(String[] args) {

//        //Exercise 1
//        Person p1 = new Person("Patrick");
//        Person p2 = new Person("James");
//
//        System.out.println(p1.getName());
//
//        System.out.println(p2.sayHello());
//
//        p1.setName("Kristen");
//
//        System.out.println(p1.getName());

        //Exercise 2

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //True
//        System.out.println(person1 == person2); //False They are 2 difference locations

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //True They reference to the same location

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //Jane
//        System.out.println(person2.getName()); //Jane





    }
}
