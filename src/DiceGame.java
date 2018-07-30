import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
diceRoll();
    }
        public static void diceRoll () {
            boolean userCont = true;
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            while (userCont) {
                System.out.println("Test your luck. Roll  the dice!");
                int sides = sc.nextInt();
                int roll1 = rand.nextInt(sides);
                int roll2 = rand.nextInt(sides);
                System.out.println("dice 1: " + (roll1 + 1));
                System.out.println("dice 2: " + (roll2 + 1));
                System.out.println("Would you like to roll again? (y/n)");
                String userAnswer = sc.next();
                if (userAnswer.equals("n")) {
                    System.out.println("It's been fun. Thanks for playing!");
                    userCont = false;
                }
            }
        }
    }
