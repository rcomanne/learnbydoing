import java.util.Scanner;

public class SpaceBoxin {
    public static void main(String[] args) {
        double weight;
        int choice;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your current earth weight: ");
        weight = input.nextDouble();

        System.out.println("I have information for the following planets: ");
        System.out.println("\t 1. Venus\t2. Mars\t\t 3. Jupiter");
        System.out.println("\t 4. Saturn\t5. Uranus\t 6. Neptune");
        System.out.print("\nWhich planet are you visiting?");
        choice = input.nextInt();

        switch(choice) {
            case 1:
                System.out.println("You weight would be "+(weight*0.91)+" kgs on that planet");
                break;
            case 2:
                System.out.println("You weight would be "+(weight*0.38)+" kgs on that planet");
                break;
            case 3:
                System.out.println("You weight would be "+(weight*2.34)+" kgs on that planet");
                break;
            case 4:
                System.out.println("You weight would be "+(weight*0.93)+" kgs on that planet");
                break;
            case 5:
                System.out.println("You weight would be "+(weight*0.92)+" kgs on that planet");
                break;
            case 6:
                System.out.println("You weight would be "+(weight*1.12)+" kgs on that planet");
                break;
            default:
                System.out.println("Please enter a number corresponding to a planet!");
        }
    }
}
