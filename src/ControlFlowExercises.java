import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean userContinues = true;

//        do {
//            System.out.print("What number would you like to go up to?");
//            int userInt = sc.nextInt();
//            System.out.println();
//            System.out.println("Here is your table");
//            System.out.println();
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInt; i += 1){
//            System.out.printf("% -7d", i);
//            System.out.print("|");
//            System.out.printf("%-8d", i * i);
//            System.out.print("|");
//            System.out.printf("% -9d", i * i * i);
//            System.out.println();
//        }
//        System.out.print("Would you like to enter another number (y/n)?");
//        String userResponse = sc.next();
//        if (!userResponse.equalsIgnoreCase(anotherString: "y")){
//            userContinues = false;
//        }
//    }while (userContinues);
//


//        Display a table of powers.


//        Prompt the user to enter an integer.


//        Display a table of squares and cubes from 1 to the value entered.


//        Ask if the user wants to continue.


//        Assume that the user will enter valid data.


//        Only continue if the user agrees to.


//        System.out.println("What was your grade?");
//        int grade = sc.nextLine();
//        switch(grade) {
//            case (grade > 87 && grade = 100):
//                System.out.println("A");
//                break;
//            case (grade > 79 && grade = 87):
//                System.out.println("B");
//                break;
//            case (grade > 66 && grade = 79):
//                System.out.println("C");
//                break;
//            case (grade > 59 && grade = 66):
//                System.out.println("D");
//                break;
//            case (grade = 0 && grade > 58):
//                System.out.println("F");
//                break;
//            default:
//                System.out.println("Not a valid grade.");
//                break;
//        }

        boolean anotherGrade = true;
        do {
            System.out.print("Please enter a numerical grade from 0 to 100 ");

        int numericGrade = sc.nextInt();

        if (numericGrade >= 88){
            System.out.println("A");
        } else if (numericGrade >= 80){
            System.out.println("B");
        }else if (numericGrade >= 67) {
            System.out.println("C");
        } else if (numericGrade >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }




        System.out.print("Would you like to enter your grade? (y/n)");
        String userResponse = sc.next();
        if (!userResponse.equalsIgnoreCase( "y")) {
            anotherGrade = false;
        }
        }while (anotherGrade);
    }
}
