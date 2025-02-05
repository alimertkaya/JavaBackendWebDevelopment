import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = in.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = in.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = in.nextDouble();

        if ((num1 < num2) && (num1 < num3) ) {
            if (num2 < num3)
                System.out.printf("%.2f < %.2f < %.2f\n", num1, num2, num3);
            else
                System.out.printf("%.2f < %.2f < %.2f\n", num1, num3, num2);
        } else if ((num2 < num1) && (num2 < num3)) {
            if (num1 < num3)
                System.out.printf("%.2f < %.2f < %.2f\n", num2, num1, num3);
            else
                System.out.printf("%.2f < %.2f < %.2f\n", num2, num3, num1);
        } else {
            if (num1 < num2)
                System.out.printf("%.2f < %.2f < %.2f\n", num3, num1, num2);
            else
                System.out.printf("%.2f < %.2f < %.2f\n", num3, num2, num1);
        }
    }
}
