public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();
        RestaurantDish dish1 = new RestaurantDish();

        dish.costInCents = 150;
        dish.nameOfDish = "hamburger";
        dish.wouldRecommend = true;

        dish1.costInCents = 100;
        dish1.nameOfDish = "fries";
        dish1.wouldRecommend = true;

        dish.eat();

        System.out.printf("%d %s %b",dish.costInCents, dish.nameOfDish,dish.wouldRecommend);










    }
}
