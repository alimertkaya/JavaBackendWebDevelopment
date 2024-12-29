import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double n1 = in.nextDouble();
        System.out.print("Enter the second number: ");
        double n2 = in.nextDouble();

        System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division");
        System.out.print("Your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                double sum = n1 + n2;
                System.out.println("Sum: " + sum);
                break;
            case 2:
                double sub = n1 - n2;
                System.out.println("Sub: " + sub);
                break;
            case 3:
                double multi = n1 * n2;
                System.out.println("Multi: " + multi);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    double divide = n1 / n2;
                    System.out.printf("Division: %.2f ", divide);
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
