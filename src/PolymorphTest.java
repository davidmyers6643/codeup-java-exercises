public class PolymorphTest {
    public static void main(String[] arg) {
        Person person = new Person();
        Employee david = new Employee();
        SuperHero batMan = new SuperHero("Bruce Wayne", "Batman");
        Employee one = new Employee();
        Employee mgr = new Manager();
        david.setName("david");
        System.out.println(david.getName());
        david.doWork();

        person.setName("Allen");
        System.out.println(person.getName());
        person.sayHello();


        System.out.println(batMan.getName());
//        System.out.println(batMan.SuperHero());
        System.out.println(batMan.getSecretID());



        one.doWork();
        mgr.doWork();

        Employee[] employees = {};
        Manager[] managers = {};

        employees[0] = one;
        employees[1] = mgr;

        for (Employee emp: employees) {
            emp.doWork();
        }
    }
}
