import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double result = 0.0;
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            result += (1.0 / i);
        }
        System.out.printf("Harmonic Sum = %.2f\n", result);
    }
}