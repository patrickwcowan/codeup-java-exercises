import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Loop Basics
        //a. While Loop
//
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

        //b. Do While

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

//        c.for

//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }


//        2. FizzBuzz

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("Fizz Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        3. Display a table of powers



do {

    System.out.println("What would you like to go up to? ");
    int userInput = scanner.nextInt();
    System.out.println("number | squared | cubed\n" +
            "------ | ------- | -----");

    for (int number = 1; number <= userInput; number++) {
        int squared = number * number;
        int cubed = squared * number;
        System.out.format("%-6d | %-6d  | %-6d\n", number, squared, cubed);
    }

    System.out.println("Would you like to continue? (yes or no) ");
    String userContinue = scanner.next();

    if (userContinue.equals("yes")) {
        continue;
    } if (userContinue.equals("no")) {
        break;
    } else {
        break;
    }

} while (true);


//       String num1 = "yes";
//       String num2 = "yes";
//
//        if (num1 == "yes") {
//            System.out.println("Equals");
//        } else {
//            System.out.println("No Equal");
//        }



//        4. Convert given number grades into letter grades.


//        String userContinue;
//        do {
//
//        System.out.print("Give me you numerical Grade: ");
//        int userGrade = scanner.nextInt();
//
//         if (userGrade >= 88 && userGrade <= 100) {
//             System.out.println("Your grade is a A");
//         } else if (userGrade >= 80 && userGrade <= 87) {
//             System.out.println("Your grade is a B");
//         } else if (userGrade >= 67 && userGrade <= 79) {
//             System.out.println("Your grade is a C");
//         } else if (userGrade >= 60 && userGrade <= 66) {
//             System.out.println("Your grade is a D");
//         } else if (userGrade >= 0 && userGrade <= 59) {
//             System.out.println("Your grade is a F");
//         }
//
//            System.out.println();
//         System.out.println("Would you like to continue? (yes or no) ");
//         userContinue = scanner.next();
//
//        } while (userContinue.equals("yes"));


        //FIZZ BUZZ PUSHUPS
        //FOR LOOP

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FIZZ BUZZ");
//            } else if (i % 3 == 0) {
//                System.out.println("FIZZ");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //DO WHILE LOOP
        // You want at least the first execution

//        int i = 0;
//
//        do {
//            i++;
//            if (i % 15 == 0) {
//                System.out.println("FIZZ BUZZ");
//            } else if (i % 3 == 0) {
//                System.out.println("FIZZ");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        } while (i <= 99);

//        //DO LOOP
//
//        int i = 1;
//
//        while (i <=100) {
//            if (i % 15 == 0) {
//                System.out.println("FIZZ BUZZ");
//            } else if (i % 3 == 0) {
//                System.out.println("FIZZ");
//            } else if (i % 5 == 0) {
//                System.out.println("BUZZ");
//            } else {
//                System.out.println(i);
//            }
//            i++;
//        }

//        //Counting by
//
//        System.out.println("What number would you like to count up to? ");
//        int countingNumber = scanner.nextInt();
//
//        System.out.println("How would you like to count?");
//        int countingBy = scanner.nextInt();
//
//        for (int i = 0; i <= countingNumber; i +=countingBy) {
//            System.out.format("Your number is: %d \n",i);
//        }
//        System.out.println("Done!");

        //Multiplication Table

//        System.out.println("Fun with Multiplication!");
//        System.out.println();
//        System.out.println("How high do you want you multiplication to go?");
//        int howHigh = scanner.nextInt();
//        System.out.println("What would you like to multiply by?");
//        int multiPlier = scanner.nextInt();
//
//        System.out.println("Number | Multiplier | Result\n" +
//                           "------ | ---------- | ------");
//
//        for (int i = 0; i <= howHigh; i++) {
//            int multipleNumber = multiPlier;
//            int multiplication = i * multipleNumber;
//            System.out.format("%-6d | %-10d | %-6d\n",i,multipleNumber,multiplication);
//        }


        /////BONUS
//        1) create three variables, start, end, and sum. Use a loop to find the summation
//        of all the numbers between start and end (inclusive)





//        2) write a loop which will output all the prime numbers (evenly divisible by only
//        1 and themselves) between 10 and 10000



    }
    }

