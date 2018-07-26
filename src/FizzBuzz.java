import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

//
//            for (int i = 0; i <= 100; i++) {
//                if (i % 15 == 0) {
//                    System.out.println("Fizz Buzz");
//                }
//                else if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                }
//                else if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                }
//                else System.out.println(i);
//            }

        Scanner scan = new Scanner(System.in);

        String answer;
        do {

            System.out.println("enter an integer:");
            int userInt = scan.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            String pipe = "|";
            for (int i = 1; i < userInt; i++) {
                int num = i;
                int squared = i * i;
                int cubed = i * i * i;
                System.out.printf("%s %6s %s %7s %s \n", num,pipe,squared,pipe, cubed);
            }
            System.out.println("Would you like to continue? [y,n]");
            answer = scan.next();
        }while(answer.equals("y"));
        System.out.println("Thanks for playing!");


        String goAgain;

        do {
            System.out.println("Enter a grade between 0 and 100");
            char grade = ' ';
            int usersGrade = scan.nextInt();
            if (usersGrade <= 100 && usersGrade >= 88) {
                grade = 'A';
            } else if (usersGrade <= 87 && usersGrade >= 80) {
                grade = 'B';
            } else if (usersGrade <= 79 && usersGrade >= 67) {
                grade = 'C';
            } else if (usersGrade <= 66 && usersGrade >= 60) {
                grade = 'D';
            } else if (usersGrade <= 59) {
                grade = 'F';
            }
            System.out.println(grade);
            System.out.println("Would you like to continue [y,n]");
            goAgain = scan.next();

        }while(goAgain.equals("y"));

        System.out.println("Thanks for playing");
    }
}
