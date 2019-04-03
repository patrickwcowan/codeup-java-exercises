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
        int i=0;
            String input = scanner.next();
            try {
                i = Integer.valueOf(input);
            } catch (NumberFormatException ex) {
                System.out.println("Wrong format");
                i = getInt();
            }
        return i;
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
        double i = 0;
            String input = scanner.next();
            try {
                i = Double.valueOf(input);
            } catch (NumberFormatException ex) {
                System.out.printf("Wrong format: %s");
                i = getDouble();
            }
        return i;
    }



}
