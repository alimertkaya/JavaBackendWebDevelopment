import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Duplicate even numbers: ");

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0 && arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");

                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }
}
