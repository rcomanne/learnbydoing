import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;

        System.out.println("Enter three integers:");
        System.out.print("Side 1: ");
        x = keyboard.nextInt();
        System.out.print("Side 2: ");
        y = keyboard.nextInt();
        while (y < x) {
            System.out.println(y+" is smaller than "+x+" try again.");
            y = keyboard.nextInt();
        }
        System.out.print("Side 3: ");
        z = keyboard.nextInt();
        while (z < y) {
            System.out.println(z+" is smaller than "+y+" try again.");
            z = keyboard.nextInt();
        }

        System.out.println("Your three sides are: "+ x + ", " + y + ", " + z);
        if (z > y && y > x) {
            System.out.println("These sides make a right triangle!");
        } else {
            System.out.println("These sides do NOT make a right triangle!");
        }
    }
}
