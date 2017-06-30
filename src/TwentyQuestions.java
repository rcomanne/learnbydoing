import java.util.Scanner;

public class TwentyQuestions {
    public static void main(String[] args) {
        String q1;
        boolean q2;
        String guess = "I don't know";

        Scanner input = new Scanner(System.in);

        System.out.println("Two questions!");
        System.out.println("Think of an object, and I'll try to guess it.");
        System.out.println("\nQ1) Is it animal, vegetable or mineral?");
        q1 = input.next();
        System.out.println("\nQ2) Is it bigger than a breadbox?");
        q2 = (input.next().equalsIgnoreCase("yes") ? true : false);

        if (q2) {
            if (q1.equalsIgnoreCase("animals")) {
                guess = "mouse";
            } else if (q1.equalsIgnoreCase("vegetable")) {
                guess = "watermelon";
            } else if (q1.equalsIgnoreCase("mineral")) {
                guess = "Camaro";
            } else {
                System.out.println("Please choose a correct object");
            }
            System.out.println("My guess is: "+guess);
        } else {
            if (q1.equalsIgnoreCase("animals")) {
                guess = "squirrel";
            } else if (q1.equalsIgnoreCase("vegetable")) {
                guess = "carrot";
            } else if (q1.equalsIgnoreCase("mineral")) {
                guess = "paper clip";
            } else {
                System.out.println("Please choose a correct object");
            }
            System.out.println("My guess is: "+guess);
        }
    }
}
