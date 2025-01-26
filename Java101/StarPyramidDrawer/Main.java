import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = (2*n - 1); j > 0; j--) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }
}
