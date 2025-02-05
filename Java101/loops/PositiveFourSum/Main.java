import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, sum = 0;

        do {
            System.out.print("Enter a number: ");
            num = in.nextInt();

            if (num < 0) {
                System.out.println("Please enter a positive number.");
                continue;
            }
            if (num % 4 == 0)
                sum += num;
        } while (num % 2 != 1);
        System.out.println("Total Sum: " + sum);
    }
}
