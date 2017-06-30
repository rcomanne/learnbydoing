import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        int answer = 1 + r.nextInt(10);
        int guess = 0;
        System.out.println("I'm thinking of a number between 1 - 10. Try to guess it!");

        do {
            guess = input.nextInt();
            if (guess != answer) {
                System.out.println("Haha!");
            }
        } while (guess != answer);
        System.out.println("You got it!");
    }
}
