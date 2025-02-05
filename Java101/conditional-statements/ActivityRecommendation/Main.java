import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the heat: ");
        float heat = in.nextFloat();
        int situation = 0;

        if (heat < 5) situation = 1;
        else if (heat <= 25) {
            if (heat <= 15) situation = 2;
            if (heat >= 10) situation = 3;
        }
        else situation = 4;

        switch (situation) {
            case 1 -> System.out.println("You can ski");
            case 2 -> System.out.println("You can go to cinema");
            case 3 -> System.out.println("You can go to picnic");
            case 4 -> System.out.println("You can go to swimming");
        }
    }
}
