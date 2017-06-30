import java.util.Scanner;

public class BabyCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c;
        String op;

        System.out.println("Enter a 0 to quit te calculator");
        System.out.println("Please enter in this format: 4 + 4");

        do {
            c = 0;
            System.out.print("> ");
            a= sc.nextDouble();
            op = sc.next();
            b = sc.nextDouble();

            if (op.equals("+")) {
                c = a+b;
            } else if (op.equals("*")) {
                c = a*b;
            } else if (op.equals("-")) {
                c = a-b;
            } else if (op.equals("/")) {
                c = a/b;
            } else if (op.equals("^")) {
                c = Math.pow(a, b);
            } else {
                System.out.println("Something went wrong.");
            }
            if (a==0) {
                System.out.println("Bye.");
                break;
            } else {
                System.out.println(c);
            }


        } while (true);
    }

}
