import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double distance, total;
        double perKmRate = 2.20;
        double openingFee = 10.0;
        Scanner in = new Scanner(System.in);

        System.out.print("distance (KM): ");
        distance = in.nextDouble();

        total = openingFee + (distance * perKmRate);
        System.out.printf("The total taxi fare is: %.2f ", ((total < 20) ? 20 : total));
    }
}
