package shapes;

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(){

    }


    public double getArea(){
        double area = Math.pow(radius,2) * Math.PI;
        System.out.printf("The area of the circle is: %s \n", area);
        return area;
    }

    public double getCircumference(){
        double circumference = (2 * Math.PI) * radius;
        System.out.printf("The circumference of the circle is: %s \n", circumference);
        return circumference;

    }

    public static void main(String[] args) {
        Circle circ = new Circle(22.5);
        System.out.println(circ.getArea());
        System.out.println(circ.getCircumference());
    }

}
