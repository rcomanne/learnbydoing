import java.util.Scanner;

public class AgeFiveYears {

    public static void main(String[] args) {
        String name;
        int age;

        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        name = input.next();
        System.out.println("\nHi, "+name+"! How old are you?");
        age = input.nextInt();
        int ageOld = age - 5;
        int ageNew = age + 5;
        System.out.println("\nDid you know that in five years you would be "+ageNew+" years old?");
        System.out.println("And five years ago you were "+ageOld+"! Imagine that!");
    }


}
