import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        String nameF;
        String nameL;
        int grade;
        int studentId;
        String login;
        double gpa;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter this information so I can sell it!");

        System.out.print("First name: ");
        nameF = input.next();
        System.out.print("Last name: ");
        nameL = input.next();
        System.out.print("Grade: ");
        grade = input.nextInt();
        System.out.print("Student ID: ");
        studentId = input.nextInt();
        System.out.print("Login: ");
        login = input.next();
        System.out.print("GPA (0.0 - 4.0): ");
        gpa = input.nextDouble();

        System.out.println("Your information:");

        System.out.println("\tLogin: "+login);
        System.out.println("\tStudent ID: "+studentId);
        System.out.println("\tName: "+nameF+" "+nameL);
        System.out.println("\tGPA: "+gpa);
        System.out.println("\tGrade: "+grade);
    }
}
