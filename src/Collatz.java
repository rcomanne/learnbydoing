import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        int counter = 0;

        System.out.print("numbering number:");
        number = keyboard.nextInt();

        do {
            System.out.print(number);
            System.out.print("\t");
            counter++;
            if ( (number % 2) == 0) {
                number = number/2;
            } else {
                number = number * 3 + 1;
            }
            if (counter % 10 == 0) {
                System.out.println("\n");
            }
        } while (number != 1);
        System.out.println(number+"\nTerminated after "+counter+" steps.");

    }
}
