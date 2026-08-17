public class Main {
    public static void main(String[] args) {
        // Instantiate shapes with sample values
        Circle circle = new Circle("Red", 5); // radius = 5
        Rectangle rectangle = new Rectangle("Blue", 6, 4); // length=6, width=4

        // Display Circle
        System.out.println("Circle:");
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", circle.calculatePerimeter());

        // Display Rectangle
        System.out.println("Rectangle:");
        System.out.printf("Area: %.1f%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.1f%n", rectangle.calculatePerimeter());
    }
}