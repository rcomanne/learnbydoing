import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        double height;
        double weight;
        double bmi;
        String bmiCategory;

        Scanner input = new Scanner(System.in);

        System.out.print("Your height in cm: ");
        height = input.nextDouble();
        System.out.print("Your weight in kg: ");
        weight = input.nextDouble();
        height = height/100;
        bmi = weight / (height*height);
        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            bmiCategory = "underweight";
        } else if (bmi >= 18.50 && bmi < 25) {
            bmiCategory = "normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            bmiCategory = "overweight";
        } else if (bmi > 30) {
            bmiCategory = "obese motherfucker";
        } else {
            System.out.println("Something went wrong :/");
            bmiCategory = "ERROR!";
        }
        System.out.println("BMI Category: "+ bmiCategory);

    }
}
