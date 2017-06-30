import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String ready;
        int q1;
        int q2;
        int q3;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Are you ready for the quiz?(Y/N)");
        ready = input.next();
        if (ready.equalsIgnoreCase("Y")) {
            System.out.println("Okay here it comes!");
            // Q1
            System.out.println("\nQ1) What is the capital of Alaske?");
            System.out.println("\t\t 1) Melbourne");
            System.out.println("\t\t 2) Anchorage");
            System.out.println("\t\t 3) Juneau");
            q1 = input.nextInt();
            if (q1 == 3) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }

            // Q2
            System.out.println("\nQ2) Can you store the value \"cat\" in a variable of type int?");
            System.out.println("\t\t 1) Yes");
            System.out.println("\t\t 2) No");
            q1 = input.nextInt();
            if (q1 == 2) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }

            // Q3
            System.out.println("\nQ3) What is the result of 9+6/3?");
            System.out.println("\t\t 1) 5");
            System.out.println("\t\t 2) 11");
            System.out.println("\t\t 3) 15/3");
            q1 = input.nextInt();
            if (q1 == 2) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }

            System.out.println("Overall you got "+score+" out of 3 correct.\nThanks for playing!");

        } else {
            System.out.println("The get ready and try again!");
        }




    }
}
