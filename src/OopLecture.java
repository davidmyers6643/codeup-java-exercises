public class OopLecture {
    public static void main(String[] arg) {
//
//        Person p1 = new Person();
//        p1.firstName = "Bob";
//        p1.lastName = "Bobberson";
//
//        Person p2 = new Person();
//        p2.firstName = "Sally";
//        p2.lastName = "Sander";
//
//        System.out.println(p1.firstName);
//        System.out.println(p1.lastName);
//
//        System.out.println(p2.firstName);
//        System.out.println(p2.lastName);
//
//        System.out.println(p1.sayHello());
//        System.out.println(p2.sayHello());
//
//        Dog d = new Dog();
//        d.name = "Sparky";
//        d.breed = "Lab";
//        d.canBreed = true;
//        d.age = 3;
//
//        Dog
//
//        d.callDog("Sparky");
//        System.out.println(Dog.humanToDogYears(d.age));
//
//        System.out.println(Arithmetic.pi);
//        System.out.println(Arithmetic.add(1, 2));

//
//
//        Person.worldPopulation += 1;
//        Person theBestDrummerAlive = new Person();
//        System.out.println(theBestDrummerAlive.worldPopulation);
////        System.out.println(Person.name);

        Student jane = new Student("Jane Doe", "Zion");
        System.out.print(jane.name + " - ");
        System.out.println(jane.cohort);
// prints "Jane Doe - Zion"
        Student john = new Student("John Doe");
        System.out.print(john.name + " - ");
        System.out.println(john.cohort);
// prints "John Doe - Unassigned"

    }
}
