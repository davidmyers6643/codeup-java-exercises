package movies;
import util.Input;

import java.util.*;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
//        int movieChoice = input.getIntWithinRange(0, 5);
        Movie[] arraysOfMovie = MoviesArray.findAll();

        while (true) {
            System.out.println("Which category would you like to see?");

            System.out.println(  "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n\n\n" +
                "Enter your choice: ");



            switch (input.getInt(0, 5)) {
                case 0:
                    System.out.println("You have chosen to exit. Have a great day.");
                    System.exit(0);
                    break;
                case 1:
                    for (Movie movie : arraysOfMovie) {
                        printMovie(movie);                    }
                    break;
                case 2:
                    for (Movie movie : arraysOfMovie) {
                        if (movie.getCategory().equals("animated")) {
                            printMovie(movie);                        }
                    }
                    break;
                case 3:
                    for (Movie movie : arraysOfMovie) {
                        if (movie.getCategory().equals("drama")) {
                            printMovie(movie);                        }
                    }
                    break;
                case 4:
                    for (Movie movie : arraysOfMovie) {
                        if (movie.getCategory().equals("horror")) {
                            printMovie(movie);                        }
                    }
                    break;
                case 5:
                    for (Movie movie : arraysOfMovie) {
                        if (movie.getCategory().equals("scifi")) {
                            printMovie(movie);
                        }



            }
        }
    }
}
    public static void  printMovie(Movie movie) {
        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
    }

}