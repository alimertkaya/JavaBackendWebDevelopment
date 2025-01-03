import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0, counter = 0;

        System.out.print("Your Math Score: ");
        int math = in.nextInt();
        if (math >= 0 && math <= 100) {
            total += math;
            counter++;
        }

        System.out.print("Your Physics Score: ");
        int physics = in.nextInt();
        if (physics >= 0 && physics <= 100) {
            total += physics;
            counter++;
        }

        System.out.print("Your Turkish Score: ");
        int turkish = in.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            total += turkish;
            counter++;
        }

        System.out.print("Your Chemistry Score: ");
        int chemistry = in.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            total += chemistry;
            counter++;
        }

        System.out.print("Your Music Score: ");
        int music = in.nextInt();
        if (music >= 0 && music <= 100) {
            total += music;
            counter++;
        }

        if (counter > 0) {
            double average = (double) total / counter;
            if (average > 55)
                System.out.println("You passed");
            else
                System.out.println("You failed");
            System.out.println("Average Score: " + average);
        }
        else {
            System.out.println("No valid scores");
        }
    }
}
