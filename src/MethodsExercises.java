public class MethodsExercises {
    public static void main(String[] args) {


//        System.out.println(addition(5,4));
//
//        System.out.println(subtraction(5,4));

//        System.out.println(multiplication(4,2));

//        System.out.println(division(10,1));

//        count(5);

//        System.out.println(multiplication(11,10));

//        getInteger(1,10);

//        System.out.println(factorial());

//        System.out.println(diceRoll());

//         diceRoll();



    }

//    public static int addition(int num1,int num2){
//        return num1+num2;
//    }
//
//    public static int subtraction (int num1,int num2) {
//        return num1-num2;
//    }
//
//    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    //Multiplication without the *
//
//    public static int multiplication(int num1, int num2) {
//        int output = 0;
//        for (int i = 1; i <= num2; i++) {
//            output += num1;
//        }
//        return output;
//    }
//
//    public static int division(int num1, int num2) {
//        return num1/num2;
//    }

//    public static int multiplication(int num1, int num2) {
//        if (num2 <= 0) {
//            return num2;
//        } else {
//            return num1 + multiplication(num1,num2-1);
//        }
//    }

//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//        if (userInput >= min && userInput <= max) {
//            System.out.println("Your number is within range!");
//            return userInput;
//        } else {
//            System.out.println("Please choose another number");
//            return getInteger(min,max);
//        }
//    }

//    public static long factorial() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//        if (userInput<=10 && userInput>=1) {
//            int num1 = 1;
//            for (int i = 1; i <= userInput; i++) {
//                num1 *= i;
//            }
//            return num1;
//        } else {
//            return factorial();
//        }
//    }

//    public static long factorial() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = scanner.nextInt();
//
//        if (userInput<=10 && userInput>=1) {
//            return userInput * (factorial()-1);
//        } else {
//            return factorial();
//        }
//    }

//    /Dice Rolling Game

//    public static int diceOne(int input) {
//        int dice = (int) (Math.random() * input) + 1;
//        return dice;
//    }
//
//
//    public static void diceRoll() {
//
//            //This is giving the sides of dice:
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("How many sided dice would you like?");
//            int diceSide = scanner.nextInt();
//
//        String userResponse;
//
//        do {
//            //prompting the user if they would like roll the dice
//            System.out.println("Would you like to roll the dice? [y/n]");
//            userResponse = scanner.next();
//
//            //Dice calls and input users input into the callback Method
//            int dice1 = diceOne(diceSide);
//            int dice2 = diceOne(diceSide);
//
//            if (userResponse.equalsIgnoreCase("y")) {
//                System.out.format("Dice One: %s; Dice Two: %s\n", dice1, dice2);
//            } else {
//                return;
//            }
//        } while (userResponse.equalsIgnoreCase("y"));
//
//    }




//Bonus

//    You’ll be creating a text based RPG in your console!
//–	Allow user to input their hero name.
//–	Ask if they are ready to start. If yes, then start the game.
//–	Give a display of enemy stats and hero stats. These values can be assigned by you.
//–	Decide on what actions your hero can take.
//–	For example:
//1.	Attack (each time 1 is input, enemy health should decrease)
//2.	Drink potion (adds to hero health.)
//3.	Run? (ends the game)
//       –	Keep asking for user input until the enemy health reaches 0, then end the game.
//       **BONUS:
//       –	allow user to input enemy name.
//       –	have the enemy attack the hero to decrease heroHealth after each time the hero takes an action
//       –	if heroHealth reaches 0 before the enemy’s end game with message “Game Over.”
//       –	Indicate how many potions your hero starts with. Decrement each time this action is used.
//
//~ Have fun and get creative!~

//    ================================= JAVA METHOD BONUSES
//
//---- BONUS 1
//
//    Create a class called SentenceAnalyzer.
//
//    Create an application in this class that allows the user to enter a sentence
//            and tells them how many vowels and consonants were used.
//
//    Example:
//
//    input - "The hill are alive."
//    output - 5 vowels and 10 consonants
//
//    Seperate your logic into various methods, as needed.
//
//
//---- BONUS 2
//
//    Create a date format converter tool in a class called DateConverter.
//
//    Take in a string in the following format:
//
//    MM/DD/YYYY
//
//    Output the following:
//
//    MonthName DD, YYYY
//
//    Example:
//
//    input - 12/01/1999
//    output - December 12, 1999
//
//    Seperate your logic into various methods, as needed.
//
//    As an extra challenge, use method overloading to take in an optional boolean second argument that specifies if the date conversion should happen in reverse (e.g. taking in "December 12, 1999" and outputting "12/01/1999").
//
//
//            ---- BONUS 3
//
//    Create a command line calculator application in a class called CalculatorApp. Use various methods, as needed. s
//
//    The program should welcome the user, prompt them for a calculation,
//    and give the result. The user should be prompted after each result is
//    outputted if they want to enter another calculation. When they
//    say no, give them an exit message. Allow the user first to specify
//    how many operands they will enter. Do not worry about
//    input validation (assume the user always enters the correct data type).
//
//    Example program (values in {} designate user input are are for example purposes only):
//
//            ...
//
//    WELCOME TO THE CALCULATOR APP!!!
//
//    Do you wish to enter a new calculation? {yes}
//
//    How many operands will you calculate? {2}
//
//    Please enter a calculation: {2 + 2}
//
//    The output of 2 + 2 is 4.
//
//    Do you wish to enter a new calculation? {no}
//
//    GOODBYE!!!

}
