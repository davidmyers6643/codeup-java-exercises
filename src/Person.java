import util.Input;

public class Person {


//    GradesApplication variable
private String name;


//share with all sub-class
protected String lastName;

    public Person (){
        setName(name);
    }

    public Person (String name){
        this.name = name;
    }






    public String getName() {
            return this.name;
        }

    public void setName(String name){ this.name = name; }

    public void sayHello(){
            System.out.println("Hello " + this.name);
        }





//        public String lastName;
//
//        public String sayHello() {
//            return "Hi. My name is " + firstName + " " + lastName + ".";
//        }
//            public static long worldPopulation = 7_500_000_000L;
//            public String name;
//
//            public static void main(String[] args) {
//                Person theBestDrummerAlive = new Person();
//                theBestDrummerAlive.name = "Neil Peart";
//
//        }

}
