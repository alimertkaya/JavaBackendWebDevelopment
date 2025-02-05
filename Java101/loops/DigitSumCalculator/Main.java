import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        while (num != 0) {
            total += (num % 10);
            num /= 10;
        }
        System.out.println("Total = " + total);
    }
}
