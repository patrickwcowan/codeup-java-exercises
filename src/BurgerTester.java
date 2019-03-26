public class BurgerTester {

    public static void main(String[] args) {


        BurgerTools burger1 = new BurgerTools("lettuce",7,160);



//        burger1.setMostPopularTopping("Pickles");
//        burger1.setAverageDayBeforeExpiration(2);
//        burger1.setTemperatureWhenCooked(200);
        System.out.printf("%s %s %s",burger1.getMostPopularTopping(),burger1.getTemperatureWhenCooked(),burger1.getAverageDayBeforeExpiration());





//        System.out.println(burger1.mostPopularTopping);
//        System.out.println(burger1.averageDayBeforeExpiration);
//        System.out.println(burger1.temperatureWhenCooked);

    }
}
