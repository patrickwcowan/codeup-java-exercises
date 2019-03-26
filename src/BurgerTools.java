public class BurgerTools {
    private static String mostPopularTopping = "cheese";
    private static int averageDayBeforeExpiration = 10;
    private static int temperatureWhenCooked = 160;

    public void grill() {
        System.out.println("Grilling burger");
    }

    public BurgerTools(String mostPopularTopping, int averageDayBeforeExpiration, int temperatureWhenCooked) {
        this.setMostPopularTopping(mostPopularTopping);
        this.setAverageDayBeforeExpiration(averageDayBeforeExpiration);
        this.setTemperatureWhenCooked(temperatureWhenCooked);
    }

    public String getMostPopularTopping() {
        return mostPopularTopping;
    }

    public void setMostPopularTopping(String mostPopularTopping) {
        this.mostPopularTopping = mostPopularTopping;
    }

    public int getAverageDayBeforeExpiration() {
        return averageDayBeforeExpiration;
    }

    public void setAverageDayBeforeExpiration(int averageDayBeforeExpiration) {
        this.averageDayBeforeExpiration = averageDayBeforeExpiration;
    }

    public int getTemperatureWhenCooked() {
        return temperatureWhenCooked;
    }

    public void setTemperatureWhenCooked(int temperatureWhenCooked) {
        this.temperatureWhenCooked = temperatureWhenCooked;
    }






}
