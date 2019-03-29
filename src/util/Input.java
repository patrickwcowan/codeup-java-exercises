package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
       String input = scanner.next();
      return input;
    }

    public boolean yesNo() {
        String input = scanner.next();
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt (int min, int max) {
        System.out.printf("Enter a number between %s and %s ",min,max);
        int input = scanner.nextInt();
        if (input >= min && input <= max ) {
            return input;
        } else
        return getInt();
    }

    public int getInt() {
        int input = scanner.nextInt();
        return input;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a double between %s and %s ",min,max);
        double input = scanner.nextDouble();
        if (input >= min && input <= max ) {
            return input;
        } else
            return getDouble();
    }

    public double getDouble() {
        double input = scanner.nextDouble();
        return input;
    }



}
