import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args) {
        double number1;
        double number2;
        double number3;

        Scanner input = new Scanner(System.in);
        System.out.print("What is your first number?");
        number1 = input.nextDouble();
        System.out.print("What is your second number?");
        number2 = input.nextDouble();
        System.out.print("What is your third number?");
        number3 = input.nextDouble();
        double outcome = (number1+number2+number3) / 2;
        System.out.println("( "+number1+" + "+number2+" + "+number3+" ) /2 is ... "+outcome);
    }
}
