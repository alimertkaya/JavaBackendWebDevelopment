import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, counter = 0;

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                counter++;
            }
        }
        double avg = (double) sum / counter;
        System.out.println("Average: " + avg);
    }
}
