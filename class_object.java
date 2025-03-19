// Class declaration
class Car {
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayCar() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }
}

public class class_object {
    public static void main(String[] args) {
        // Object creation
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);

        // Calling method using objects
        car1.displayCar();
        car2.displayCar();
    }
}
