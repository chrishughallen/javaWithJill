package util;

public class InputTest extends Input{

    public void playAgain(){
        System.out.println("Would you like to play again?");
        if(yesNo()){
            System.out.println("Continue");
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {
        Input inputTest = new Input();


//
//        inputTest.getInt(2,10,"Enter a number between 1 and 10");
//
//
//        System.out.println(inputTest.getString("Enter a string"));
//
//        System.out.println(inputTest.yesNo("Enter yes or no"));
//
//        System.out.println(inputTest.getInt(12,25, "Enter a number between 12 and 25"));
//
//        System.out.println(inputTest.getDouble(2.6,9.6, "Enter a double between 2.6 and 9.6"));

    }


}
