import util.Input;


public class Employee extends Person {
   public void doWork() {
       System.out.println("I am working!");

    }
    @Override
    public void sayHello() {
        System.out.println("How is your day");
    }
}
