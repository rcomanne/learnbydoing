import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int increase = 0;

        System.out.print("Count from:");
        start = keyboard.nextInt();
        System.out.print("Count to:");
        end = keyboard.nextInt();
        System.out.print("Count by:");
        increase = keyboard.nextInt();

        for (int i = start; i <= end; i += increase) {
            System.out.print(i+" ");
        }
    }


}
