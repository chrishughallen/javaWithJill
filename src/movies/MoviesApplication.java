package movies;

import util.Input;

public class MoviesApplication {

    public static Input input = new Input();

//    7:20

    public static Movie[] movies = MoviesArray.findAll();


    public static void moviesApp() {
        System.out.println("What would you like to do?\n" +
                "\n0 - exit\n1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        int userChoice = input.getInt();

        if (userChoice == 1) {
            for (Movie movie : movies) {
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        }


        if (userChoice == 2) {
            for (Movie movie : movies) {
                if (movie.getCategory().equals("animated")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        }
        if (userChoice == 3) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("drama")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        }

        if (userChoice == 4) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("horror")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        }

        if (userChoice == 5) {
            for (Movie movie : movies) {
                if (movie.getCategory().equalsIgnoreCase("")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        }

        if(input.yesNo("Would you like to continue? [y,n]")){
            moviesApp();
        }
        else System.out.println("Thanks for using the movies app!");
    }

    public static void main(String[] args) {
        moviesApp();
    }
}
