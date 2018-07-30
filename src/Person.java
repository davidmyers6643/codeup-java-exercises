public class Person {

       private String name;


        public String getName() {
            return this.name;
        }
       public void setName(String name){
           this.name = name;
       }
        public void sayHello(){
            System.out.println("Hello " + this.name);
        }

        public static void main(String[] arg) {

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
