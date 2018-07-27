package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        return this.scanner.nextLine().equalsIgnoreCase("y") || this.scanner.nextLine().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %s and %s \n", min,max);
        int userInput = this.scanner.nextInt();
        if(userInput<min || userInput>max){
            getInt(min,max);
        }
        return userInput;
    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a double between %s and %s \n", min,max);
        if(this.scanner.nextDouble()<min || this.scanner.nextDouble()>max){
            getDouble(min,max);
        }
        return this.scanner.nextDouble();
    }

    public double getDouble(){
        return this.scanner.nextDouble();
    }
}
