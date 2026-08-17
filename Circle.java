public class Circle extends AbstractShape {
    private double radius;

    // Constructor — pass color to parent; set radius directly
    public Circle(String color, double radius) {
        super(color, radius, radius); // length/width not used by Circle
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}