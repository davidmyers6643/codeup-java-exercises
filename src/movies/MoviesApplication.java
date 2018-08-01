package movies;
import util.Input;

import java.util.*;

public class MoviesApplication {

    public static void main(String[] args) {
        Movie[] arraysOfMovie = MoviesArray.findAll();
        Input input = new Input();

        System.out.println("Which category would you like to see? \n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n\n\n" +
                "Enter your choice: ");
        int movieChoice = input.getIntWithinRange(0, 5);
        boolean answer = true;

        switch (movieChoice) {
            case 0:
                    System.out.printf("You have chosen to exit. Have a great day.");
                break;
            case 1:
                for (Movie movie : arraysOfMovie) {
                    System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());

                }
                break;
            case 2:
                for (Movie movie : arraysOfMovie) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
                break;
            case 3:
                for (Movie movie : arraysOfMovie) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());

                    }
                }
                break;
            case 4:
                for (Movie movie : arraysOfMovie) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
                break;
            case 5:
                for (Movie movie : arraysOfMovie) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
                    }
                }
                break;
                default:
                    System.out.println("Please choose a valid response.");
            }
        }
    }