import java.util.*;

public class Day_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = sc.nextInt();
        sc.close(); // Close the scanner to prevent resource leak
        if (a > 0) {
            System.out.println("Is positive");
        } else {
            System.out.println("Is Negative");
        }
    }
}
