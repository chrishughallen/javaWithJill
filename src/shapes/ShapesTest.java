package shapes;

public class ShapesTest implements Measurable {

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    public static void main(String[] args) {
        Measurable myShape = new Rectangle(2,9) {
            @Override
            public double getPerimeter() {
                return (length *2) + (width *2);
            }
            @Override
            public double getArea() {
                return length * width;
            }
        };

        System.out.println(myShape.getArea());
        System.out.println(myShape);
    }
}

