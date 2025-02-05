import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        int ebob = 1;
        int i = 1;

        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0)
                ebob = i;
            i++;
        }
        int ekok = (num1 * num2) / ebob;
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
