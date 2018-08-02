public class BurgerTools {

    public String mostPopularTopping;
    public int averageDaysBeforeExpiration;
    public int temperatureWhenCooked;



    public BurgerTools(String mostPopularTopping, int averageDaysBeforeExpiration, int temperatureWhenCooked) {

        this.mostPopularTopping = mostPopularTopping;
        this.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
        this.temperatureWhenCooked = temperatureWhenCooked;
    }
    public static String grill() {
        return "Grilling Burger";
    }
}
