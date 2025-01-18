import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sign = "";

        System.out.print("Enter your birth year: ");
        int year = in.nextInt();

        if (year < 0)
            System.out.println("Please enter a positive year");
        else {
            int reminder = year % 12;
            switch (reminder) {
                case 0 -> sign = "Monkey";
                case 1 -> sign = "Rooster";
                case 2 -> sign = "Dog";
                case 3 -> sign = "Pig";
                case 4 -> sign = "Rat";
                case 5 -> sign = "Ox";
                case 6 -> sign = "Tiger";
                case 7 -> sign = "Rabbit";
                case 8 -> sign = "Dragon";
                case 9 -> sign = "Snake";
                case 10 -> sign = "Horse";
                case 11 -> sign = "Goat";
            }
            System.out.println("Your Chinese Zodiac Sign: " + sign);
        }
        in.close();
    }
}
