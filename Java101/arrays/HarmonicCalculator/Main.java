import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0, avg = 0;

        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        for (int number : arr) {
            sum += 1.0 / number;
        }
        avg = arr.length / sum;
        System.out.printf("Harmonic Series Sum: %.2f\n", sum);
        System.out.printf("Harmonic Average: %.2f\n", avg);
    }
}
