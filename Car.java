public class Car extends Vehicle {
    // Additional attribute for Car
    private int numberOfDoors;

    // Car constructor — calls super() to initialize inherited attributes
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Pass to Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Display all details — inherited + own
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}