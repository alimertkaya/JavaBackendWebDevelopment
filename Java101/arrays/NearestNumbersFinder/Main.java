import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Entered Number: ");
        int num = in.nextInt();

        for (int i : arr) {
            if (i < num)
                if (i > min)
                    min = i;

            if (i > num)
                if (i < max)
                    max = i;
        }

        System.out.println("Nearest smaller number: " + min);
        System.out.println("Nearest larger number: " + max);
    }
}
