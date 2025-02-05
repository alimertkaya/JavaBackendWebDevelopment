import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nFactorial = 1, rFactorial = 1, nRFactorial = 1;

        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter r: ");
        int r = in.nextInt();
        in.close();

        for (int i = 1; i <= n; i++)
            nFactorial *= i;

        for (int i = 1; i <= r; i++)
            rFactorial *= i;

        for (int i = 1; i <= (n - r); i++)
            nRFactorial *= i;

        int combination = nFactorial / (rFactorial * nRFactorial);
        System.out.println("C(" + n + "," + r + ") = " + combination);
    }
}
