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


    public static Groceries groceryBuilder(String input1, int input2) {
       Groceries grocery = new Groceries(input1,input2);
       return grocery;
    }

    public static void addToMap(String input1,Groceries input2,Map<String,Groceries> input3) {
        input3.put(input1,input2);
    }



    public static void main(String[] args) {

        Input input = new Input();
        Map<String, Groceries> gList = new HashMap<>();


        System.out.println("Would you like to create a grocery list?");
        if (input.yesNo()) {
                do {
                    System.out.println("Choose a grocery category:\n" +
                            "Dairy\n" +
                            "Meat\n" +
                            "Produce\n");
                    String firstInput = input.getString();

                    System.out.println("Enter item name: ");
                    String secondInput = input.getString();

                    System.out.println("Enter quantity: ");
                    int thirdInput = input.getInt();

                    addToMap(firstInput,groceryBuilder(secondInput,thirdInput),gList);

                    System.out.println("Would you like to enter another item?");
                } while (input.yesNo());

                System.out.println("Choose form the following:\n" +
                                   "1. View List\n" +
                                   "2. Exit\n");

                System.out.println(gList);

        }
















    }

}