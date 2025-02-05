import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        in.close();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.printf("%d is a leap year!", year);
        else
            System.out.printf("%d is not a leap year!", year);
    }
}
