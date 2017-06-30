import java.util.Scanner;

public class LetterAtATime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your message? ");
        String message = input.nextLine();
        int length = message.length();
        System.out.println("\nYour message is "+length+" characters long.");
        System.out.println("Your first character is at position 0 and is '"+message.charAt(0)+"'.");
        System.out.println("Your last character is at position "+(length-1)+" and is "+message.charAt(length-1)+"'.");
        System.out.println("\nHere are all your characters, one at a time:");

        for (int i = 0; i < length; i++) {
            System.out.println("\t"+i+" - '"+message.charAt(i)+"'");
        }
    }
}
