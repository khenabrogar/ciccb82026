public class Vehicle {
     // Attributes — protected so subclass can access directly
    protected String make;
    protected String model;
    protected int year;

    // Constructor to initialize all Vehicle attributes
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
