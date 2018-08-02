import util.Input;

public class PersonTest {
    public static void main(String[] args) {

        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.getString("Give me something!"));
        System.out.println(input.yesNo());


        Person human = new Person();
        human.setName("David");
        human.sayHello();

        Person employee = new Person();
        employee.setName("Joe");
        employee.sayHello();

        Person parent = new Person();
        parent.setName("Victoria");
        parent.sayHello();

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
////
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}
