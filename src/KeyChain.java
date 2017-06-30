import java.util.Scanner;

public class KeyChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean active = true;
        int amount = 0;
        int price = 10;

        System.out.println("Ye Olde Keychain Shoppe\n");

        while (active) {

            System.out.println("1. Add Keychains to Order");
            System.out.println("2. Remove Keychains from Order");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");

            System.out.print("Please enter your choice");
            int input = sc.nextInt();


        }
    }

}
