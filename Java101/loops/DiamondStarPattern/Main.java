import java.util.Scanner;
/*
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
* */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n: ");
        int n = in.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 1; i--) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}