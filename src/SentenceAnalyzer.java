import java.util.Scanner;

public class SentenceAnalyzer {

    public static void main(String[] args) {

        System.out.println(sentence());

    }

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
//    Separate your logic into various methods, as needed.

    public static String sentence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence.");
        String userSentence = scanner.nextLine();
        userSentence = userSentence.replace(" ","");
        int vowelNumber =vowelCount(userSentence);
        String returnStatement = "You total is: " + vowelNumber;
        return returnStatement;
    }

    public static int vowelCount(String input) {
        return input.charAt('a');

    }






}
