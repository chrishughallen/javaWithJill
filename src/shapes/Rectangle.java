package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength() {
        this.length = length;
    }

    @Override
    public void setWidth() {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }


}
