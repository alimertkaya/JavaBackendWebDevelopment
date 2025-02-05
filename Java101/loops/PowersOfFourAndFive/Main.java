import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.print("Sayı girin: ");
        num = in.nextInt();

        for (int i = 1, j = 1; i <= num || j <= num; i *= 4, j *= 5) {
            System.out.println(i + " " + j);
        }
    }
}
