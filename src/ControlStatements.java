public class ControlStatements {
    public static void main(String[] args) {
//        boolean isLoggedIn = false;
//        boolean isAdmin = false;
//        if (isLoggedIn && isAdmin) {
//            System.out.println("Show the admin menu");
//        }else if (isLoggedIn || isAdmin){
//            System.out.println("Show the index page.");
//        }else {
//            System.out.println("You are not allowed to see this page...");
//        } if (!isLoggedIn) {
//            System.out.println("Redirecting you to login page.");
//        }
//
//        String name = "david";
//        if (name.equals("david")) {
//            System.out.println("YOur name matches");
//            } else {
//            System.out.println("Your name doesn't match");
//        }
//
//        String lname = "myers";
//        if ("myers".equals(lname)){
//            System.out.println("Your last name is " + lname);
//        } else {
//            System.out.println("Your last name does't match.");
//        }
//
//        int grade = 88;
//        switch (grade){
//            case 50:
//                System.out.println("You need to practice more");
//                break;
//            case 70:
//                System.out.println("You passed");
//                break;
//            case 80:
//                System.out.println("Good Job!");
//                break;
//            default:
//                System.out.println("Not a valid grade");
//
//        }

        boolean condition = true;
        int number = 0;
//        while (condition) {
//            if (number == 10){
//                condition = false;
//            }
//            System.out.println(number);
//            number++;
//
//            number = 1;
//            condition = true;
//        }

        do {
            if (number == 10) {
                condition = false;
            }
            System.out.println(number);
            number++;
        } while (condition);


        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            if(i == 5) {
                break;
            }
        }

        System.out.println("Continue Example");
        for (int i = 1; i <= 10; i++){
            if (i == 4 || i == 8) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
