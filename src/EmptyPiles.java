import java.util.Scanner;

public class EmptyPiles {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = 3;
        int b = 4;
        int c = 5;
        String input;
        int amount;
        int counter = 0;

        System.out.print("Player 1: ");
        String player1 = keyboard.next();
        System.out.print("Player 2: ");
        String player2 = keyboard.next();

        do {
            System.out.println("\nA: "+a+"\tB: "+b+"\tC: "+c+"\n");

            if ((counter % 2) == 0) {
                System.out.print(player1 + " choose a pile: ");
            } else {
                System.out.print(player2+" choose a pile: ");
            }

            input = keyboard.next();
            if (input.equalsIgnoreCase("a")) {
                System.out.print("How many to remove from pile A:");
                amount = keyboard.nextInt();
                if (amount != 0 && amount > 0 && amount <= a) {
                    a -= amount;
                } else {
                    System.out.print("No cheating! How many do you want to take?");
                    amount = keyboard.nextInt();
                    a -= amount;
                }
            }
            if (input.equalsIgnoreCase("b")) {
                System.out.print("How many to remove from pile B:");
                amount = keyboard.nextInt();
                if (amount != 0 && amount > 0 && amount <= b) {
                    b -= amount;
                } else {
                    System.out.print("No cheating! How many do you want to take?");
                    amount = keyboard.nextInt();
                    b -= amount;
                }
            }
            if (input.equalsIgnoreCase("c")) {
                System.out.print("How many to remove from pile C:");
                amount = keyboard.nextInt();
                if (amount != 0 && amount > 0 && amount <= c) {
                    c -= amount;
                } else {
                    System.out.print("No cheating! How many do you want to take?");
                    amount = keyboard.nextInt();
                    c -= amount;
                }
            }
            counter++;
        } while (a > 0 || b > 0 || c > 0);
        if ((counter%2)==0) {
            System.out.println("\nCongratulations, "+player1);
        } else {
            System.out.println("\nCongratulations, "+player2);
        }
    }
}
