public class BurgerTester {
    public static void main(String[] arg) {

        BurgerTools test = new BurgerTools("cheese", 1, 145);
       test.mostPopularTopping = "cheese";
       test.averageDaysBeforeExpiration = 1;
       test.temperatureWhenCooked = 145;


        System.out.println(test.temperatureWhenCooked);
        System.out.println(test.averageDaysBeforeExpiration);
        System.out.println(test.temperatureWhenCooked);
        System.out.println(BurgerTools.grill());
       }
}
