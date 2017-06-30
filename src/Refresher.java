import java.util.Scanner;

public class Refresher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 10;

        System.out.print("What is your name?");
        String name = sc.next();

        if (name.equalsIgnoreCase("Mitchell")) {
            number = 5;
        }

        for (int i = 0; i <= number; i++) {
            System.out.println(name);
        }
    }
}
