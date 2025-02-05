import java.util.Scanner;

public class Main {
    static void pattern(int num, int original, boolean increasing) {
        System.out.print(num + " ");

        if (num <= 0)
            increasing = true;

        if (increasing && num == original)
            return;

        pattern((increasing ? num + 5 : num - 5), original, increasing);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N: ");
        int n = in.nextInt();
        pattern(n, n, false);
    }
}
