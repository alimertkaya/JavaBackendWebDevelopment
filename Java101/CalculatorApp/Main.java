import java.util.Scanner;

public class Main {

    static void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum = " + result);
    }

    static void minus(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction = " + result);
    }

    static void times(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication = " + result);
    }

    static void divided(int a, int b) {
        if (b == 0) {
            System.out.println("The second number must be different from 0");
        } else {
            int result = a / b;
            System.out.println("Division = " + result);
        }
    }

    static void power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        System.out.println(a + "^" + b + " = " + result);
    }

    static void mod(int a, int b) {
        int result = a % b;
        System.out.println("Modulus = " + result);
    }

    static void calc(int a, int b) {
        System.out.println("Perimeter = " + (2 * (a + b)));
        System.out.println("Area = " + (a * b));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponentiation\n"
                + "6- Modulus\n"
                + "7- Rectangle Area and Perimeter Calculation\n"
                + "0- Exit";

        while (true) {
            System.out.println(menu);
            System.out.print("Select an operation: ");
            select = in.nextInt();
            if (select == 0) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("First Number: ");
            int num1 = in.nextInt();
            System.out.print("Second Number: ");
            int num2 = in.nextInt();

            switch (select) {
                case 1:
                    sum(num1, num2);
                    break;
                case 2:
                    minus(num1, num2);
                    break;
                case 3:
                    times(num1, num2);
                    break;
                case 4:
                    divided(num1, num2);
                    break;
                case 5:
                    power(num1, num2);
                    break;
                case 6:
                    mod(num1, num2);
                    break;
                case 7:
                    calc(num1, num2);
                    break;
                default:
                    System.out.println("You entered an invalid value, please try again.");
            }
        }
    }
}
