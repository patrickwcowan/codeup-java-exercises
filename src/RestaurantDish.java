public class RestaurantDish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void eat() { System.out.println("num num num"); }

    public RestaurantDish(){
        System.out.println("New dish is being created!");
    }


    public static void main(String[] args) {
        RestaurantDish dish1 = new RestaurantDish();

        dish1.wouldRecommend = false;
        dish1.nameOfDish = "Olive Salad";
        dish1.costInCents = 100;

        System.out.format("%s %s %s\n",dish1.wouldRecommend,dish1.nameOfDish,dish1.costInCents);
        dish1.eat();

    }


}