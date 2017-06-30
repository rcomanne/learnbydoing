import java.util.Scanner;

public class AddingValuesForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        System.out.print("Number: ");
        int entry = input.nextInt();
        for (int i = 0; i <= entry; i++) {
            x += i;
            System.out.println(i);
        }
        System.out.println("The sum is: "+x);
    }
}
