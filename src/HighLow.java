import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLowGame();

    }

        public static int randomNumber() {
        int dice = (int) (Math.random() * 100) + 1;
        return dice;
    }



    public static void highLowGame() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        String playAgain;

        do {
            int randomizer = randomNumber();
            System.out.println(randomizer);

            //Counter
            int guessCounter = 0;

                do {
                    ;
                    System.out.println();
                    System.out.println("Enter a number: ");
                    userInput = scanner.nextInt();
                    if (userInput == randomizer) {
                        System.out.println();
                        System.out.println("Good Guess!!!");
                        System.out.println();
                    } else if (userInput < randomizer) {
                        System.out.println();
                        System.out.println("Higher!!!");
                        System.out.println();
                        guessCounter += 1;
                        System.out.println("You've reached " + guessCounter + " guesses. (limit 5)");
                    } else if (userInput > randomizer) {
                        System.out.println();
                        System.out.println("Lower!!!!");
                        System.out.println();
                        guessCounter += 1;
                        System.out.println("You've reached " + guessCounter + " guesses. (limit 5)");
                    }

                    if (guessCounter < 5) {
                        continue;
                    } else {
                        System.out.println("////////////////////////////////////\n" +
                                           "/You've reached too many guesses.../\n" +
                                           "////////////////////////////////////");
                        break;
                    }

                } while (userInput > randomizer || userInput < randomizer);

            System.out.println();
            System.out.println("///////////////////////////\n" +
                               "/Want to play again? [y,n]/\n" +
                               "///////////////////////////");
            System.out.println();
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("y"));

    }


}
