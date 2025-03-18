import java.util.Scanner;

public class Instance_Variables {  // Removed underscore from class name
    int number;
    String name;
    Scanner scanner = new Scanner(System.in);

    void takeInput() {
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
    }

    void displayOutput() {
        System.out.println("Hello, " + name + "!");
        System.out.println("You entered the number: " + number);
    }

    public static void main(String[] args) {
        Instance_Variables obj = new Instance_Variables(); // Corrected object creation
        obj.takeInput();
        obj.displayOutput();
    }
}
