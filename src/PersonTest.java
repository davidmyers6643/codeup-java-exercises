public class PersonTest {
    public static void main(String[] args) {
        Person human = new Person();
        human.setName("David");
        human.sayHello();

        Person employee = new Person();
        employee.setName("Joe");
        employee.sayHello();
    }
}
