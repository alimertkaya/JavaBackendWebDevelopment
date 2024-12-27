import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double money, TaxAmount, TaxRate, total;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        money = in.nextDouble();

        TaxRate = (money > 0 && money < 1000) ? 0.18 : 0.08;
        TaxAmount = money * TaxRate;
        total = money + TaxAmount;

        System.out.println("Price without Tax: " + money);
        System.out.println("Tax Rate: " + TaxRate);
        System.out.printf("Tax Amount: %.1f\n",TaxAmount);
        System.out.println("Price with Tax: " + total);

    }
}
