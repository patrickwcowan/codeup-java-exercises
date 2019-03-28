public class ServerNameGenerator {

    public static String randomElement(String x[]) {
        int randomIndex = (int) (Math.random() * x.length);
        return x[randomIndex];

    }


    public static void main(String[] args) {

        String[] adjectives = {"Fruity","Fluffy","Salty","Hard","Hot","Cold","Slippery","Smooth","Mute","Green"};
        String[] nouns = {"Bag","Cup","House","Shovel","Boot","Shirt","Hat","Chair","Desk","TV"};

        String randomAdjective = randomElement(adjectives);
//        System.out.println(randomAdjective);

        String randomNoun = randomElement(nouns);
//        System.out.println(randomNoun);

        System.out.printf("Here is your server name:\n%s - %s",randomAdjective,randomNoun);
    }

}
//
//
//    We are going to build a server name generator.

//    Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//    Create two arrays whose elements are strings, one with at least 10 adjectives,
//     another with at least 10 nouns.

//    Create a method that will return a random element from an array of strings.

//    Add a main method, and inside of your main method select and random noun and
//     adjective and hyphenate the combination and display the generated name to the user.