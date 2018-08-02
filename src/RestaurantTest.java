public class RestaurantTest {
    public static void main(String[] arg) {
RestaurantDish dish = new RestaurantDish();
    dish.nameOfDish = "Hamburger";
    dish.costInCents = 800;
    dish.wouldRecommend = true;
        System.out.println(dish.nameOfDish);
        System.out.println(dish.costInCents);
        System.out.println(dish.wouldRecommend);
      dish.eat();

    }
}
