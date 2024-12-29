import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Height (in meters): ");
        double height = in.nextDouble();
        System.out.print("Weight (in kg): ");
        double weight = in.nextDouble();

        double bmi = weight / (Math.pow(height, 2));
        System.out.printf("Your BMI is: %.2f", bmi);
    }
}
