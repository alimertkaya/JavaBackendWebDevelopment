import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String zodiacSign = "";
        boolean isError = false;

        System.out.print("Enter your birth month: ");
        int month = in.nextInt();

        System.out.print("Enter your birth day: ");
        int day = in.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                zodiacSign = (day < 22) ? "Capricorn" : "Aquarius";
            } else
                isError = true;
        } else if (month == 2) {
            if (day >= 1 && day <= 29) {
                zodiacSign = (day < 20) ? "Aquarius" : "Pisces";
            } else
                isError = true;
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                zodiacSign = (day < 21) ? "Pisces" : "Aries";
            } else
                isError = true;
        } else if (month == 4) {
            if (day >= 1 && day < 30) {
                zodiacSign = (day < 21) ? "Aries" : "Taurus";
            } else
                isError = true;
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                zodiacSign = (day < 22) ? "Taurus" : "Gemini";
            } else
                isError = true;
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                zodiacSign = (day < 23) ? "Gemini" : "Cancer";
            } else
                isError = true;
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                zodiacSign = (day < 23) ? "Cancer" : "Leo";
            } else
                isError = true;
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                zodiacSign = (day < 23) ? "Leo" : "Virgo";
            } else
                isError = true;
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                zodiacSign = (day < 23) ? "Virgo" : "Libra";
            } else
                isError = true;
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                zodiacSign = (day < 23) ? "Libra" : "Scorpio";
            } else
                isError = true;
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                zodiacSign = (day < 22) ? "Scorpio" : "Sagittarius";
            } else
                isError = true;
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                zodiacSign = (day < 22) ? "Sagittarius" : "Capricorn";
            } else
                isError = true;
        } else {
            System.out.println("Invalid month entered.");
            isError = true;
        }
        if (isError)
            System.out.println("Invalid input. Please check your month and day.");
        else
            System.out.println("Your Zodiac Sign: " + zodiacSign);
    }
}