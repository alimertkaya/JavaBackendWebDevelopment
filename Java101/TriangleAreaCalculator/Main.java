import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double u, area;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        a = in.nextInt();

        System.out.print("Enter the length of side b: ");
        b = in.nextInt();

        System.out.print("Enter the length of side c: ");
        c = in.nextInt();

        // semiPerimeter
        u = (a + b + c) / 2.0;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Area: " + area);
    }
}
