import java.util.Scanner;

public class AreaCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;
        double result = 0;

        System.out.println("-=-=-=-=-=-=-=-=-");
        System.out.println("Choose a shape:");
        System.out.println("\n1)Triangle\n2)Rectangle\n3)Square\n4)Circle\n5)Quit");
        int choice = sc.nextInt();
        if (choice == 5) {
            System.exit(0);
        } else if (choice == 1) {
            System.out.print("Base: ");
            x = sc.nextInt();
            System.out.print("Height: ");
            y = sc.nextInt();
            result = area_triangle(x,y);
        } else if (choice == 2) {
            System.out.print("Length: ");
            x = sc.nextInt();
            System.out.print("Height: ");
            y = sc.nextInt();
            result = area_rectangle(x,y);
        } else if (choice == 3) {
            System.out.print("Side: ");
            x = sc.nextInt();
            result = area_square(x);
        } else if (choice == 4) {
            System.out.print("Radius: ");
            x = sc.nextInt();
            result = area_circle(x);
        }

        System.out.println("\nThe area is: "+result);

    }

    public static double area_circle( int radius ) {
        double pi = Math.PI;
        return (pi * (radius*radius));
    }
    public static int area_rectangle( int length, int width ) {
        return (length * width);
    }
    public static int area_square( int side ) {
        return (side * side);
    }
    public static double area_triangle( int base, int height ) {
        return (base*height)/2;
    }

}
