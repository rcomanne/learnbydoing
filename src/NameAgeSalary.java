import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int age;
        double salary;

        System.out.println("Hello. What is your name?");
        name = keyboard.next();

        System.out.println("Hi "+name+"! How old are you?");
        age = keyboard.nextInt();

        System.out.println("So you are "+age+" years old. That's not too bad!\nHow much do you make, "+name);
        salary = keyboard.nextDouble();

        System.out.println(salary+"! I hope that's per hour and not per year!");
    }
}
