import java.util.*;
public class Pattern9 {
    
    public static void main(String args[]) {
        int n = 6;
        int i, j;

        // Outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // Inner loop to print spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Inner loop to print stars
            for (j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // Printing new line for each row
            System.out.println();
        }
    }
}
