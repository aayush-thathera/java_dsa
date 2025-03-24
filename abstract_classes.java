// Abstract class
abstract class Vehicle {
    abstract void start(); // Abstract method (no body)

    void stop() { // Concrete method (has body)
        System.out.println("Vehicle is stopping...");
    }
}

// Subclass implementing the abstract method
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class abstract_classes {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();  // Calls the overridden method in Car
        myCar.stop();   // Calls the inherited method from Vehicle
    }
}
