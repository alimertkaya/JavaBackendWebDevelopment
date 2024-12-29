import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, area, circumference,sectorArea, angle;
        double PI = 3.14;
        Scanner in = new Scanner(System.in);

        System.out.print("Radius: ");
        r = in.nextDouble();
        System.out.print("Angle: ");
        angle = in.nextDouble();

        area = PI * (r * r);
        circumference = 2 * PI * r;
        sectorArea = (PI * (r * r) * angle) / 360;
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);
        System.out.println("Circle Sector Area: " + sectorArea);
    }
}
