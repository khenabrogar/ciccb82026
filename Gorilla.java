public class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding time! Putting gorilla food into cage.");
            return true; // feeding happened
        } else {
            System.out.println("Not time to eat. Gorilla is resting.");
            return false; // feeding skipped
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming: lather, rinse, repeat.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Careful — petting the gorilla at your own risk!");
    }

    // Main method to demonstrate all three methods
    public static void main(String[] args) {
        Gorilla myGorilla = new Gorilla();

        // Call feed with true to match sample output
        boolean fedSuccessfully = myGorilla.feed(true);
        myGorilla.groom();
        myGorilla.pet();
    }
}