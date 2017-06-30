import java.util.Random;
import java.util.Scanner;

public class BabyBlackJack {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        String answer;
        int p1 = 2 + r.nextInt(11);
        int p2 = 2 + r.nextInt(11);
        int temp = 0;
        int ptotal = p1 + p2;
        int d1 = 2 + r.nextInt(11);
        int d2 = 2 + r.nextInt(11);
        int dtotal = d1 + d2;
        double wager;
        System.out.println("Baby Blackjack!\n");

        System.out.print("How much would you like to bet? ");
        wager = input.nextDouble();

        System.out.println("You drew "+p1+" and "+p2);
        System.out.println("Your total is "+ptotal+"\n");
        if (ptotal > 21) {
            System.out.println("Busted! You lose.");
            System.out.println("Money lost: " + wager);
            System.exit(0);
        }
        if (dtotal > 21) {
            System.out.println("Dealer's busted! His total was: " + dtotal);
            System.out.println("Money won: " + (wager*2));
            System.exit(0);
        }
        System.out.println("Dealer drew "+d1+" and a hidden card");
        System.out.println("Dealer's total is hidden\n");


        System.out.print("\nWould you like to \"hit\" or \"stay\"?");
        answer = input.next();
        while (answer.equalsIgnoreCase("hit")){
            temp = 2 + r.nextInt(11);
            ptotal += temp;
            if(ptotal > 21) {
                System.out.println("You drew a " + temp + " with a total of " + ptotal);
                System.out.println("\nBusted! Dealer wins");
                System.out.println("Money lost: " + wager);
                System.exit(0);
            }
            System.out.println("You drew a " + temp+".");
            System.out.println("Your total is "+ptotal+".");
            System.out.print("Would you like to \"hit\" or \"stay\"?");
            answer = input.next();
        }

        System.out.println("\nOkay, dealer's turn");
        System.out.println("His hidden card was a " + d2);
        System.out.println("His total was " + dtotal);

        while (dtotal <= 16) {
            temp = 2 + r.nextInt(11);
            dtotal += temp;
            System.out.println("\nDealer chooses to hit");
            System.out.println("Dealer drew a " + temp);
            System.out.println("Dealer's total is " + dtotal);
            if (dtotal > 21) {
                System.out.println("\nYou win! The dealer's busted.");
                System.out.println("Money won: " + (wager*2));
                System.exit(0);
            } else if (dtotal >= 16) {
                System.out.println("\nDealer stays");
                break;
            } else if (dtotal == 21) {
                System.out.println("\nDealer has blackjack! You lose.");
                System.out.println("Money lost: " + wager);
            }
        }

        if (dtotal >= ptotal) {
            System.out.println("\nDealer wins.");
            System.out.println("Money lost: " + wager);
        } else {
            System.out.println("\nYou win!");
            System.out.println("Money won: " + (wager*2));
        }
    }
}
