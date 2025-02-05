import java.util.Scanner;

public class Main {
    static boolean isPrime(int num, int divisor) {
        if (num < 2)
            return false;
        if (divisor * divisor > num)
            return true;
        if (num % divisor == 0)
            return false;
        return isPrime(num, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println(isPrime(num, 2) ?
                (num + " is a prime number.") :
                (num + " is not a prime number."));
    }
}
