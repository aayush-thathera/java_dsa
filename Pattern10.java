import java.util.*;
public class Pattern10 {
   
    public static void main(String args[]) {
        int n = 6;
        int i, j, k;

        // Outer loop to handle rows
        for (i = 1; i <= n; i++) {
            
            // Inner loop to print spaces
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Inner loop to print stars and spaces
            for (k = 1; k <= (2 * i - 1); k++) {
                // Print stars at the boundaries
                if (k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print spaces inside the hollow triangle
                }
            }

            // Move to the next line
            System.out.println();
        }
    }
}