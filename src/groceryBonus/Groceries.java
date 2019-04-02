package groceryBonus;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class Groceries {

    private String item;
    private int quantity;

    public Groceries(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public static void addItem() {
        Input input = new Input();

        Map<String, Groceries> gList = new HashMap<>();
        System.out.println("Choose a grocery category:\n" +
                "Dairy\n" +
                "Meat\n" +
                "Produce\n");
        String firstInput = input.getString();

        System.out.println("Enter item name: ");
        String secondInput = input.getString();

        System.out.println("Enter quantity: ");
        int thirdInput = input.getInt();

        Groceries g1 = new Groceries(secondInput, thirdInput);

        gList.put(firstInput, g1);

        System.out.println(firstInput);
    }


    public static void main(String[] args) {

        Input input = new Input();
        System.out.println("Would you like to create a grocery list?");
        if (input.yesNo()) {
            System.out.println("Would you like to enter another item?");
            if (input.yesNo()) {
                do {
                    addItem();
                    System.out.println("Would you like to enter another item?");
                } while (input.yesNo());
            }




        }
    }

}