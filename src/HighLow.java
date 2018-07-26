import java.util.Scanner;

public class HighLow {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        highLowGuessingGame();
    }



    public static int highLowGuessingGame(){
        int generatedRandomNumber = (int)Math.ceil(Math.random()*100);
        int usersGuess;
        int remainingNumberOfGuesses = 5;
        do {
            System.out.printf("Guess a number between 1 and 100. Guesses remaining = %s \n", remainingNumberOfGuesses);
            usersGuess = scan.nextInt();
            if(usersGuess>generatedRandomNumber){
                System.out.println("Too high!");
                remainingNumberOfGuesses--;
            }else if(usersGuess<generatedRandomNumber) {
                remainingNumberOfGuesses--;
                System.out.println("Too low!");
            }
        }while(usersGuess != generatedRandomNumber && remainingNumberOfGuesses>0);
        if(usersGuess == generatedRandomNumber){
            System.out.printf("GOOD GUESS! The secret number was %s \n", generatedRandomNumber);
        }
        if(remainingNumberOfGuesses == 0){
            System.out.println("YOU ARE OUT OF GUESSES!");
        }
        System.out.println("Would you like to play again? [y,n]\n");
        if(scan.next().equalsIgnoreCase("y")){
            System.out.println("Nice! Setting a new random number...");
            highLowGuessingGame();
        }
        System.out.println("Thanks for playing the guessing game!");
        return generatedRandomNumber;
    }
}
