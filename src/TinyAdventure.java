import java.util.Scanner;

public class TinyAdventure {
    public static void main(String[] args) {
        String q1;
        String q2;
        String q3;

        System.out.println("WELCOME TO YOUR TINY ADVENTURE");

        Scanner input = new Scanner(System.in);

        System.out.println("You enter house 237 on the Ceintuurbaan. Would you like to go \"upstairs\" or into the \"kitchen\"?");
        q1 = input.next();

        // Room 1, option 1
        if (q1.equalsIgnoreCase("upstairs")) {
            System.out.println("You enter a hallway, to the left there is a bathroom. To the right is a bedroom. You can go in the \"bathroom\" or in the \"bedroom\"");
            q2 = input.next();
            // Room 2, option 1
            if (q2.equalsIgnoreCase("bathroom")) {
                System.out.println("");
            }
            // Room 2, option 2
            else if (q2.equalsIgnoreCase("bedroom")) {
                System.out.println("There is a desk with a bad techno set playing, next to it are some empty pony packs. You can hear some giggling coming from the closet. Would you like open the closet? (\"yes\" or \"no\"");
                q3 = input.next();
                // Room 3, option 1
                if (q3.equalsIgnoreCase("yes")) {
                    System.out.println("In the closet is a blond guy jerking off with some sandwiches while screaming \"BAMMETJES!!!\"");
                    System.out.println("Thanks for playing!");
                }
                // Room 3, option 2
                else if (q3.equalsIgnoreCase("no")) {
                    System.out.println("Well than you can leave Max the fuck alone and get out of his room!");
                    System.out.println("Thanks for playing!");
                }
            }
            // Room 2, wrong choice
            else {
                System.out.println("Make a valid choice!");
            }
        }
        // Room 1, option 2
        else if (q1.equalsIgnoreCase("kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is a refrigerator. You can open the \"refrigerator\" or look in a \"cabinet\"");
            q2 = input.next();
        }
        // Room 1, wrong choice
        else {
            System.out.println("Make a valid choice!");
        }
    }
}
