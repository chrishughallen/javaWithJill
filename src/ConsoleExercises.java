import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f%n", pi);

//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered, " + userInput);

//        System.out.println("Enter three words");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("You entered \"%s %s %s\"",firstWord,secondWord,thirdWord);

//        System.out.println("Enter a sentence!");
//        String userInput = scanner.next();
//        System.out.println(userInput);

        System.out.println("Enter the length of the class room");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the class room");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the class room");
        double height = scanner.nextDouble();

        double area = length * width;
        double perimeter = (2 * length) + (2 * width);
        double volume = length * width * height;

        System.out.printf("The dimensions of the class room are\narea:%.2f%n\nperimeter:%.2f%n\nvolume:%.2f%n", area,perimeter,volume);
    }
}
