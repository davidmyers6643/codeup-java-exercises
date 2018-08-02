import java.util.Scanner;

// Exercise 5

//public class HighLow {
//
//    public static int numberOfGuesses;
//    public static int gameNumber;
//
//    public static void main(String[] args) {
//        initGame();
//    }
//
//    public static void initGame() {
//        boolean programRunning;
//        boolean gameRunning = true;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to the High / Low Guessing Game!");
//        do {
//            gameNumber = randomWithRange(1, 100);
//            System.out.println("The random number is: " + gameNumber);
//            do {
//                gameRunning = runRound(sc);
//            } while (gameRunning);
//            programRunning = getYesOrNo(sc).equals("y");
//        } while (programRunning);
//        System.out.println("Good bye!");
//    }
//
//    public static boolean runRound(Scanner sc) {
//        boolean gameNotWon = false;
//        System.out.print("Please enter a guess: ");
//        int playerGuess = getInteger(1, 100, sc);
//        if (playerGuess == gameNumber) {
//            System.out.println("GOOD GUESS!");
//            gameNotWon = false;
//        } else if (playerGuess > gameNumber) {
//            System.out.println("LOWER");
//            numberOfGuesses++;
//            gameNotWon = true;
//            System.out.println("Number of guesses made: " + numberOfGuesses);
//        } else {
//            System.out.println("HIGHER");
//            gameNotWon = true;
//            numberOfGuesses++;
//            System.out.println("Number of guesses made: " + numberOfGuesses);
//        }
//        return gameNotWon;
//    }
//
//    public static int randomWithRange(int min, int max)
//    {
//        int range = (max - min) + 1;
//        return (int)(Math.random() * range) + min;
//    }
//
//
//    public static int getInteger(int min, int max, Scanner sc) {
//        if (!sc.hasNextInt()) {
//            System.out.println("Not a number!");
//            return getInteger(min, max, sc);
//        }
//        int userInput = sc.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        } else {
//            System.out.println("Number not in range!");
//            return getInteger(min, max, sc);
//        }
//    }
//
//    public static String getYesOrNo(Scanner sc) {
//        String userChoice;
//        do {
//            System.out.println("Do you wish to play again? [y/n]: ");
//            userChoice = sc.next().trim();
//        } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));
//        return userChoice;
//    }
//}


//
//        int sum = 0, sum1 = 0;
//        int turn = 0;
//
//        // creating random object
//        Random ran = new Random();
//        int flag = 0;
//
//        while (true) {
//            if (turn % 2 == 0) {
//
//                int p1 = ran.nextInt(6);
//                sum += p1;
//                System.out.printf("Player 1 after turn %d is : %d\n", turn, sum);
//            }
//            else {
//
//                int p2 = ran.nextInt(6);
//                sum1 += p2;
//                System.out.printf("Player 2 after turn %d is : %d\n", turn, sum1);
//            }
//            if (sum >= 30) {
//                flag = 1;
//                break;
//            }
//            if (sum1 >= 30) {
//                flag = 2;
//                break;
//            }
//            turn++;
//        }
//        if (flag == 1)
//            System.out.println("\nPlayer 1 WON!!");
//        else
//            System.out.println("\nPlayer 2 WON!!");
//    }

import java.util.*;
public class HighLow {
    public static void main(String[] args) {
        diceRoll();
    }

    public static void diceRoll() {

        boolean userCount = true;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        Random randomNumber = new Random();
        int roundCount = 0;


        System.out.println("Feeling lucky? Roll the dice! (y/n)");
        String userAnswer = sc.next();
        if (userAnswer.equals("n")) {
            System.out.println("Well, your no fun! \nGoodBye!");
            userCount = false;
        }

        while (userCount) {
            int player1die1 = new SplittableRandom().nextInt(1, 7);
            int player1die2 = new SplittableRandom().nextInt(1, 7);
            int player2die1 = new SplittableRandom().nextInt(1, 7);
            int player2die2 = new SplittableRandom().nextInt(1, 7);

            System.out.println("Player 1's 1st die was: " + player1die1 + " and 2nd die was " + player1die2 + ".\n" + "Together they equal: " + (player1die1 + player1die2) + "\n");
            System.out.println("Player 2's 1st die was: " + player2die1 + " and 2nd die was " + player2die2 + ".\n" + "Together they equal: " + (player2die1 + player2die2) + "\n");

//        for ( roundCount = 1; roundCount < 10  ;++roundCount) {
//        } break;

            if ((player1die1 + player1die2) > (player2die1 + player2die2)) {
                System.out.println("Player 1 won this round!\n");
                roundCount += 1;

            }
            if ((player2die1 + player2die2) > (player1die1 + player1die2)) {
                System.out.println("Player 2 won this round!\n");
                roundCount += 1;

            }
            if ((player2die1 + player2die2) == (player1die1 + player1die2)) {
                System.out.println("It's a tie. Everyone won this round!\n");
                roundCount += 1;
            }


            System.out.println("You have used " + roundCount + " chances out of 10.\n");

            if (roundCount == 10) {
                System.out.println("You have used up all your chances. Have a nice day!");
                break;
            }


            System.out.println("Would you like to roll again? (y/n)");
            String userAnswer2 = sc.next();

            if (userAnswer2.equals("n")) {
                System.out.println("It's been fun. Thanks for playing!");
                userCount = false;
            }





        }
    }
}