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

        System.out.println("Frequency Count: ");
        for (int i = 0; i < size; i++) {
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                int count = 0;
                for (int j = 0; j < size; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }
                System.out.println(arr[i] + " appers " + count + " times.");
            }
        }
    }
}
