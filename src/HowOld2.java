import java.util.Scanner;

public class HowOld2 {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner input = new Scanner(System.in);

        System.out.print("Hey, what is your name? ");
        name = input.next();
        System.out.print("Ok, "+name+", how old are you? ");
        age = input.nextInt();

        if (age < 16) {
            System.out.println("You can't drive, "+name+".");
        } else if (age < 18 && age >= 16) {
            System.out.println("You can't vote, "+name+".");
        } else if (age < 25 && age >= 18) {
            System.out.println("You can't rent a car, "+name+".");
        } else if (age > 25) {
            System.out.println("You can do anything that's legal.");
        }


    }
}
