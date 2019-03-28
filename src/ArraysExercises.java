import java.util.Arrays;

public class ArraysExercises {

//    public static Person[] addPerson(Person[] array){
//        for (Person n : array) {
//            return n[]
//        }


//    public static void addPerson(Person input[]) {
//        for (int i = 0; i<=input.length;i++){
//
//        }

static Person[] addPerson(Person[] oldPeople, Person newPerson) {

    Person[] newPeople;
    newPeople = Arrays.copyOf(oldPeople,oldPeople.length+1);

    newPeople[newPeople.length-1] = newPerson;

    return newPeople;

}




    public static void main(String[] args) {

////        Exercise 1
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

//        Person p1 = new Person("Patrick");
//        Person p2 = new Person("John");
//        Person p3 = new Person("Jay");
//
//
//
//        Person[] family = {p1,p2,p3};
//        for (Person n : family) {
//            System.out.println(n.getName());
//        }


        Person[] people = new Person[3];
        people[0] = new Person("Sally");
        people[1] = new Person("Susan");
        people[2] = new Person("Bill");

        Person[] morePeople = addPerson(people,new Person("Wall-e"));


        for (Person person : morePeople) {
            System.out.println(person.getName());
        }







    }
}
