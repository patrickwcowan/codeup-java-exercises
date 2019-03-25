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

        //Counter
        int guessCounter = 0;



        do {
            int randomizer = randomNumber();
            System.out.println(randomizer);



                do {
                    System.out.println("Guess counter is: " + guessCounter);
                    System.out.println();
                    System.out.println("Enter a number Dawg! ");
                    userInput = scanner.nextInt();
                    if (userInput == randomizer) {
                        System.out.println();
                        System.out.println("Good Guess!!!");
                        System.out.println();
                    } else if (userInput < randomizer) {
                        System.out.println();
                        System.out.println("Higher DAWG!!!");
                        System.out.println();
                        guessCounter += 1;
                    } else if (userInput > randomizer) {
                        System.out.println();
                        System.out.println("Lower!!!!");
                        System.out.println();
                        guessCounter += 1;
                    }

                    if (guessCounter < 5) {
                        continue;
                    } else {
                        guessCounter = 0;
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
