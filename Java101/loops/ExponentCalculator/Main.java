import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 1;

        System.out.print("n: ");
        int base = in.nextInt();
        System.out.print("k: ");
        int exponent = in.nextInt();

        for (int i = 1; i <= exponent; i++)
            result *= base;
        System.out.println(base + "^" + exponent + "= " + result);
    }
}
