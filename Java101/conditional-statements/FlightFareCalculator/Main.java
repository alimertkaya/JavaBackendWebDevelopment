import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double discountedFare, total = 0;
        double ageDiscount = 0, roundTripDiscount = 0, normalFare = 0;

        System.out.print("Enter the distance in km: ");
        double distance = in.nextDouble();
        if (distance <= 0) {
            System.out.println("Invalid distance entered!");
            return;
        } else
            normalFare = distance * 0.10;

        System.out.print("Enter your age: ");
        int year = in.nextInt();
        if (year <= 0) {
            System.out.println("Invalid distance entered!");
            return;
        } else {
            if (year < 12)
                ageDiscount = normalFare * 0.50;
            else if (year < 24)
                ageDiscount = normalFare * 0.10;
            else if (year > 65)
                ageDiscount = normalFare * 0.30;
        }
        discountedFare = normalFare - ageDiscount;

        System.out.print("1 => One Way\n2 => Round Trip \nEnter travel type: ");
        int choice = in.nextInt();
        if (choice <= 0 || choice > 2) {
            System.out.println("Invalid travel type selected!");
            return;
        } else {
            if (choice == 2) {
                roundTripDiscount = discountedFare * 0.20;
                total = discountedFare - roundTripDiscount;
                total *= 2;
            } else {
                total = discountedFare;
            }
        }
        System.out.printf("Toplam tutar = %.2f TL",total);
    }
}
