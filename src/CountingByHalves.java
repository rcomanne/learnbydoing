import java.util.Scanner;

public class CountingByHalves {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = -10;
        System.out.println("x\n----------");
        for (double i = x; i <= 10; i+=0.5) {
            double y = i * i;
            System.out.println(i+"\t"+y);
        }
    }
}
