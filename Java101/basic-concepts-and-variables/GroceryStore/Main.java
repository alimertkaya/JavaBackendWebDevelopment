import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.0;

        System.out.print("How many kilos of Pear? : ");
        double pear = in.nextDouble();

        System.out.print("How many kilos of Apple? : ");
        double apple = in.nextDouble();

        System.out.print("How many kilos of Tomato? : ");
        double tomato = in.nextDouble();

        System.out.print("How many kilos of Banana? : ");
        double banana = in.nextDouble();

        System.out.print("How many kilos of Eggplant? : ");
        double eggplant = in.nextDouble();

        double total = (pear * pearPrice) + (apple * applePrice) + (tomato * tomatoPrice) + (banana * bananaPrice) + (eggplant * eggplantPrice);
        System.out.printf("Total %.2f TL", total);

    }
}
