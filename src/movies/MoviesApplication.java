package movies;
import util.Input;




public class MoviesApplication {

    public static void movieChoice(Movie[] hi, int userSelection) {

        if (userSelection == 2) {
            for (Movie x : hi) {
                if (x.getCategory() == "animated") {
                    System.out.printf("%s - - %s\n", x.getName(), x.getCategory());
                }
            }
        } else if (userSelection == 3) {
            for (Movie x : hi) {
                if (x.getCategory() == "drama") {
                    System.out.printf("%s - - %s\n", x.getName(), x.getCategory());
                }
            }
        } else if (userSelection == 4) {
            for (Movie x : hi) {
                if (x.getCategory() == "horror") {
                    System.out.printf("%s - - %s\n", x.getName(), x.getCategory());
                }
            }
        } else if (userSelection == 5) {
            for (Movie x : hi) {
                if (x.getCategory() == "scifi") {
                    System.out.printf("%s - - %s\n", x.getName(), x.getCategory());
                }
            }
        } else if (userSelection == 1) {
            for (Movie x : hi) {
                System.out.printf("%s - - %s\n", x.getName(), x.getCategory());
            }
        } else if (userSelection == 0) {

        }
    }

    public static void main(String[] args) {

        boolean m = true;



        ////System prompt that will ask User what to choose from
        System.out.println();
        System.out.print("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: ");

        ///This getting the user input, and storing it into a variable userSelection

        Input choice = new Input();
        int choice1 = choice.getInt();

        Movie[] hi = MoviesArray.findAll();


        movieChoice(hi,choice1);










    }
}