package util;

public class InputTest extends Input{

    public static Input inputTest = new Input();




    public static void main(String[] args) {
        System.out.println(inputTest.getString());
        System.out.println(inputTest.yesNo());
        System.out.println(inputTest.getDouble(2.5,4.9));
        System.out.println(inputTest.getDouble());
        System.out.println(inputTest.getInt(10,15));
        System.out.println(inputTest.getInt());
    }
}
