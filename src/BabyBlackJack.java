import java.util.Random;
import java.util.Scanner;

public class BabyBlackJack {

    private final static int BLACK_JACK = 21;
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer;
        int p1;
        int p2;
        int temp;
        int ptotal;
        int d1;
        int d2;
        int dtotal;
        double cash = 200;
        double wager;
        
        System.out.println("Baby Blackjack!");
        System.out.println("\nYou enter the casino with "+cash+" dollar.");

        game: while (cash > 0) {

            p1 = getNumber();
            p2 = getNumber();
            ptotal = p1+p2;
            d1 = getNumber();
            d2 = getNumber();
            dtotal = d1+d2;

                System.out.print("How much would you like to bet? ");
                wager = input.nextDouble();

                System.out.println("\nYou drew " + p1 + " and " + p2);
                System.out.println("Your total is " + ptotal + "\n");
                if (ptotal > BLACK_JACK) {
                    System.out.println("Busted! You lose.");
                    System.out.println("\nMoney lost: " + wager);
                    cash -= wager;
                    System.out.println("You now have "+cash+" dollar.");
                    continue game;
                }
                if (dtotal > BLACK_JACK) {
                    System.out.println("Dealer's busted! His total was: " + dtotal);
                    System.out.println("\nMoney won: " + (wager * 2));
                    cash += wager;
                    System.out.println("You now have "+cash+" dollar.");
                    continue game;
                }
                System.out.println("Dealer drew " + d1 + " and a hidden card");
                System.out.println("Dealer's total is hidden\n");


                System.out.print("Would you like to \"hit\" or \"stay\"?");
                answer = input.next();
                while (answer.equalsIgnoreCase("hit")) {
                    temp = getNumber();
                    ptotal += temp;
                    if (ptotal > BLACK_JACK) {
                        System.out.println("You drew a " + temp + " with a total of " + ptotal);
                        System.out.println("\nBusted! Dealer wins");
                        System.out.println("\nMoney lost: " + wager);
                        cash -= wager;
                        System.out.println("You now have "+cash+" dollar.");
                        continue game;
                    }
                    System.out.println("You drew a " + temp + ".");
                    System.out.println("Your total is " + ptotal + ".");
                    System.out.print("Would you like to \"hit\" or \"stay\"?");
                    answer = input.next();
                }

                System.out.println("\nOkay, dealer's turn");
                System.out.println("His hidden card was a " + d2);
                System.out.println("His total was " + dtotal);

                while (dtotal <= 16) {
                    temp = getNumber();
                    dtotal += temp;
                    System.out.println("\nDealer chooses to hit");
                    System.out.println("Dealer drew a " + temp);
                    System.out.println("Dealer's total is " + dtotal);
                    if (dtotal > BLACK_JACK) {
                        System.out.println("\nYou win! The dealer's busted.");
                        System.out.println("\nMoney won: " + (wager * 2));
                        cash += wager;
                        System.out.println("You now have "+cash+" dollar.");
                        continue game;
                    } else if (dtotal >= 16) {
                        System.out.println("\nDealer stays");
                    } else if (dtotal == BLACK_JACK) {
                        System.out.println("\nDealer has blackjack! You lose.");
                        System.out.println("\nMoney lost: " + wager);
                        cash -= wager;
                        System.out.println("You now have "+cash+" dollar.");
                    }
                }

                if (dtotal >= ptotal) {
                    System.out.println("\nDealer wins.");
                    System.out.println("\nMoney lost: " + wager);
                    cash -= wager;
                    System.out.println("You now have "+cash+" dollar.");
                } else {
                    System.out.println("\nYou win!");
                    System.out.println("\nMoney won: " + (wager * 2));
                    cash += wager;
                    System.out.println("You now have "+cash+" dollar.");
                }
            }
            System.out.println("You've ran out of cash! Try you luck again some other time.");
        }

        public static int getNumber () {
        Random random = new Random();
            int r = 2 + random.nextInt(13);
            int face = 10;
            if (r >= 10 && r <= 14) {
                return face;
            } else {
                return r;
            }
        }
}
