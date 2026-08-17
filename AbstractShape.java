public abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;

    // Constructor to initialize all shared attributes
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Default implementations — will be overridden by subclasses
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}