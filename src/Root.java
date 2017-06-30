import java.util.Scanner;

public class Root {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input = 0;
        double root;
        while (true) {
            System.out.print("Enter a number: ");
            input = keyboard.nextInt();
            if (input < 0) {
                System.out.println("You can't take the square root of a negative!");
            } else {
                root = Math.sqrt(input);
                System.out.println("The square root of " + input + " is " + root);
            }
        }

    }
}
