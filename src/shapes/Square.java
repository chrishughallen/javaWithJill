package shapes;

public class Square extends Quadrilateral{


    public Square() {
    }

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength() {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth() {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        return (2*length) + (2*width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
