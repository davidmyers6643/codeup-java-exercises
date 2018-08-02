import java.util.*;
public class ClassGradeFilter {
    public static void main(String[] args) {
        AlphaGrade();
    }

    public static void AlphaGrade() {

        Scanner sc = new Scanner(System.in);
        boolean userCont = true;

        while (userCont) {

            System.out.println("What was your numeric grade");
            int grade = sc.nextInt();

            if ((grade <= 100) && (grade > 90)) {
                grade = 1;
            } else if ((grade <= 90) && (grade > 80)) {
                grade = 2;
            } else if ((grade <= 80) && (grade > 70)) {
                grade = 3;
            } else if ((grade <= 70) && (grade > 60)) {
                grade = 4;
            } else if ((grade <= 60) && (grade >= 0)) {
                grade = 5;
            }

            switch (grade) {
                case 1:
                    System.out.println("You made an \"A\"");
                    break;
                case 2:
                    System.out.println("You made an \"B\"");
                    break;
                case 3:
                    System.out.println("You made an \"C\"");
                    break;
                case 4:
                    System.out.println("You made an \"D\"");
                    break;
                case 5:
                    System.out.println("You made an \"F\"");
                    break;
            }
            System.out.println("Would you like to enter another grade? (y/n)");
            String userAnswer = sc.next();
            if (userAnswer.equals("n")) {
                System.out.println("Hope everyone passed...");
                userCont = false;
            }
        }
    }
}