package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        String userInput = this.scanner.nextLine();
        return userInput;
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return "You entered " + getString();
    }

    public boolean yesNo() {
        String userInput = this.scanner.next();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public int getInt(String prompt){
        return getInt();
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if(userInt<min || userInt>max){
            System.out.println("Out of range, try again");
            return getInt(min,max);
        }
        return userInt;
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        return getInt(min,max);
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble < min || userDouble > max){
            System.out.println("Out of range, try again");
            return getDouble(min,max);
        }
        return userDouble;
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        return getDouble(min,max);
    }

    public static void main(String[] args) {
        Input tester = new Input();

        System.out.println(tester.yesNo("Would you like to play again?"));



    }



}
