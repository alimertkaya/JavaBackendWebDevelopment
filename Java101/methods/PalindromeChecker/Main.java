import java.util.Scanner;

public class Main {
    public static boolean isPalindrom(int num) {
        int temp = num;
        int lastNum, reverseNum = 0;

        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;
        }
        return (num == reverseNum) ? true : false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println(isPalindrom(num));
    }
}
