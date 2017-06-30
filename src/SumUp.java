import java.util.Scanner;

public class SumUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 0;
        int x;

        System.out.println("I will add the numbers you give me");
        x = input.nextInt();

        while (x != 0) {
            value += x;
            System.out.println("The total so far is: "+value);
            x = input.nextInt();
        }

    }
}
