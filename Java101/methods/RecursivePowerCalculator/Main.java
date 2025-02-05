import java.util.Scanner;

public class Main {
    static int power(int base, int exp) {
        if (exp == 0)
            return 1;
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = in.nextInt();
        System.out.print("Enter the exponent value: ");
        int exp = in.nextInt();

        int result = power(base,exp);
        System.out.println(base + "^" + exp + " = " + result);
    }
}
