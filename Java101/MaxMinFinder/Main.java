import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int n = in.nextInt();

        System.out.print("Enter number 1: ");
        int num = in.nextInt();
        int max = num;
        int min = num;

        for (int i = 1; i < n; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            num = in.nextInt();
            if (num > max)
                max = num;
            else if (num < min)
                min = num;
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
