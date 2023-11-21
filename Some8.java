import java.util.Scanner;

public class Some8 {
    public static void main(String[] args) {
        // declare variables
        int x, y;

        // create Scanner object
        Scanner keyboard = new Scanner(System.in);

        // enter values
        System.out.print("Enter value for x: ");
        x = keyboard.nextInt();
        System.out.print("Enter value for y: ");
        y = keyboard.nextInt();

        // code attempting to swap two variables
        int temp = x;
        x = y;
        y = temp;

        // display results
        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // close the Scanner
        keyboard.close();
    }
}
