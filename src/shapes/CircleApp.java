package shapes;

import util.Input;

public class CircleApp extends Input {

    public static Input input = new Input();

    public static void makeCircle(){
       double radius = input.getDouble("Enter the radius of your circle");
       Circle newCircle = new Circle(radius);
       newCircle.getArea();
       newCircle.getCircumference();
       if(input.yesNo("Would you like to make another circle [y,n]")){
           makeCircle();
       }
    }

    public static void main(String[] args) {
        makeCircle();
        
    }

}
