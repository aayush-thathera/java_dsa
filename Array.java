import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 8, 2, 10, 3, 7};

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Find the maximum element
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum Element: " + max);

        // Calculate sum of elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of Elements: " + sum);

        // Reverse the array
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}
