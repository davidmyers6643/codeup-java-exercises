import java.util.*;

public class ArraysLecture {
    public static void main(String[] args) {
//        String[] instructors = new String[5];
//        instructors[0] = "Justin";
//        instructors[1] = "Fer";
//        instructors[2] = "Daniel";
//        instructors[3] = "Ryan";
//        instructors[4] = "";
//        System.out.println(instructors[3]);

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[1]);


        final int NUMBER_OF_BEATELS = 4;
        BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATELS];

        theBeatles[0] = new BandMember("John");
        theBeatles[1] = new BandMember("Paul");
        theBeatles[2] = new BandMember("George");
        theBeatles[3] = new BandMember("Ringo");

        System.out.println(theBeatles[0].getName());

        String[] instructors = {"Justin", "Fer", "Daniel", "Ryan"};
        System.out.println(instructors[2]);

        String[] languages = {"html", "css", "java"};
//        for (int i = 0; i < languages.length; i++) {
//            System.out.println(languages[i]);

        for (String language : languages) {
            System.out.println(language);
        }


        String[] testArray = new String[4];
        Arrays.fill(testArray, "Badgers");

        String arrayAsAString = Arrays.toString(testArray);
        System.out.println(arrayAsAString);

        String[] meme = {"Badgers", "Mushroom", "Badges", "Snake"};

        System.out.println(Arrays.toString(meme));
        Arrays.sort(meme);
        System.out.println(Arrays.toString(meme));

        System.out.println(Arrays.binarySearch(meme, "Snake"));


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for (int n : row) {
              System.out.print(n + " | ");
            }
                System.out.println();
            }
                System.out.println("+---+---+---+");




//      int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//      for (int[] row : matrix) {
//          System.out.println("+---+---+---+");
//          System.out.print("| ");
//          for (int n : row) {
//              System.out.print(n + " | ");
//          }
//              System.out.println();
//          }
//              System.out.println("+---+---+---+");
    }
}
