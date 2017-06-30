import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess;
        int counter = 1;
        int max = 7;

        Random r = new Random();
        int generated = 1 + r.nextInt(100);

        System.out.println("I'm thinking of a number between 1-100. Try to guess it in 7 guesses");
        guess = input.nextInt();

        while (guess != generated && counter <= max) {
            if (guess > generated) {
                System.out.println("Too high!");
                guess = input.nextInt();
            } else if (guess < generated) {
                System.out.println("Too low!");
                guess = input.nextInt();
            }
            counter++;
        }
        System.out.println("Congratulations! The number was indeed " + generated);
        System.out.println("It took you " + counter+" tries");


    }
}
