import java.util.Random;
import java.util.Scanner;

public class CarGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess;

        Random r = new Random();
        int generated = 1 + r.nextInt(3);

        System.out.println("You slide up to Fast Eddie's card table and plop down your cash");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling");
        System.out.println("He lays down three cards");
        System.out.println("\nWhich one is the ace?\n");
        System.out.println("\t\t##\t##\t##\n\t\t##\t##\t##\n\t\t##\t##\t##\n\t\t1\t2\t3");
        guess = input.nextInt();

        if (generated == 1) {
            System.out.println("\t\tAA\t##\t##\n\t\tAA\t##\t##\n\t\tAA\t##\t##\n\t\t1\t2\t3");
            if(guess == generated) {
                System.out.println("Congratulations, you won!");
            } else {
                System.out.println("Fast Eddie wins again!");
            }
        } else if (generated == 2) {
            System.out.println("\t\t##\tAA\t##\n\t\t##\tAA\t##\n\t\t##\tAA\t##\n\t\t1\t2\t3");
            if(guess == generated) {
                System.out.println("Congratulations, you won!");
            } else {
                System.out.println("Fast Eddie wins again! The ace was number "+generated);
            }
        } else if (generated == 3) {
            System.out.println("\t\t##\t##\tAA\n\t\t##\t##\tAA\n\t\t##\t##\tAA\n\t\t1\t2\t3");
            if(guess == generated) {
                System.out.println("Congratulations, you won!");
            } else {
                System.out.println("Fast Eddie wins again!");
            }
        }
    }

}
