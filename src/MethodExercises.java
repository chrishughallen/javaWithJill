import java.util.Scanner;

public class MethodExercises {

    public static Scanner scanner = new Scanner(System.in);


    public static String add(int num1, int num2){
        int answer = num1 + num2;
        return num1 + " + " + num2 + " = " + answer;
    }

    public static String subtract(int num1, int num2){
        int answer = num1 - num2;
     return num1 + " - " + num2 + " = " + answer;
    }

    public static String multiply(int num1, int num2){
        int answer = num1 * num2;
        return num1 + " * " + num2 + " = " + answer;
    }

    public static String multiplyLoop(int num1, int num2){
        int total = 0;
        for(int i = 1;i<=num2;i++){
            total+= num1;
        }
        return num1 + " * " + num2 + " = " + total;
    }

    public static String divide(int num1, int num2){
        int answer = num1 / num2;
        return num1 + " / " + num2 + " = " + answer;
    }

    public static int modulo(int num1, int num2){
        int answer = num1 + num2;
        return num1 % num2;
    }

    public static String getInteger(int min, int max){
        int userInput;
        System.out.printf("Insert a number between %s and %s \n",min,max );

        userInput = scanner.nextInt();

        if(userInput<min || userInput>max){
            getInteger(min,max);
        }

        return "That was in range";
    }

    public static String calculateFactorial(){
        System.out.println("Enter an integer from 1-10");
        int numberToFactorialize = scanner.nextInt();
        if(numberToFactorialize<1 || numberToFactorialize>10){
            System.out.println("Error, out of range");
            calculateFactorial();
        }
        long factorial = 1;
        for (int i=1;i<=numberToFactorialize; i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);

        System.out.println("Would you like to continue? [y,n]");

        if(scanner.next().equals("y")){
            calculateFactorial();
        }
        System.out.println("Thanks for playing...");
        return "Thanks for playing!";

    }


    public static void rollDice() {

//      Prompt the user to enter the sides of a die
        System.out.println("Enter the number of sides on your die");

//      Stores the number they enter into an int called userInput using the scanner object
        int userInput = scanner.nextInt();

//      Creates two random dice roll outcomes based on how many sides the die has
        int roll1 = (int) Math.ceil(Math.random() * userInput);
        int roll2 = (int) Math.ceil(Math.random() * userInput);

//      Prints the messages telling them what those random dice rolls were.
        System.out.printf("The first die was %s \nThe second die was %s\n", roll1,roll2);

//      Prompts the user to play again.
        System.out.println("Play again? [y/n]");

//      If they enter "y", we use RECURSION to call rollDice() again
        if (scanner.next().equalsIgnoreCase("y")) {
            rollDice();
        }

//      If they don't input "y" this message is displayed and the function
        System.out.println("Thanks for playing!");
        }











    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(subtract(10, 2));
        System.out.println(multiply(10,15));
        System.out.println(multiplyLoop(5,20));
        System.out.println(divide(10,3));
        System.out.println(modulo(5,2));
//        calculateFactorial();
        rollDice();


    }






}
