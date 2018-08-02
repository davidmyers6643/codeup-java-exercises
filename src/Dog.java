public class Dog {
    public String name;
    public String breed;
    public final String animalType = "Canine";
    public boolean canBreed;
    public int age;

    public Dog(String name, String breed, boolean canBreed, int age) {
        this.name = name;
        this.breed = breed;
        this.canBreed = canBreed;
        this.age = age;
    }

    public void callDog(String name) {
            if (name.equalsIgnoreCase(this.name)) {
                System.out.println(this.name + " is walking towards you...");
                } else {
                System.out.println(this.name + " ignores you.");
            }
    }
    public static double humanToDogYears (double years) {
        return years * 7;
    }
}
