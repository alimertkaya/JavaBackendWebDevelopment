import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rowNumber = 2, colNumber = 2;
        boolean isValidInput = true;

        System.out.println("Welcome to Minesweeper!");
        while (isValidInput) {
            System.out.print("Enter number of rows: ");
            rowNumber = in.nextInt();
            System.out.print("Enter number of columns: ");
            colNumber = in.nextInt();

            if (rowNumber < 2 || colNumber < 2)
                System.out.println("The number of rows or columns cannot be less than 2! Please try again.");
            else
                isValidInput = false;

        }

        MineSweeper mineSweeper = new MineSweeper(rowNumber,colNumber);
        mineSweeper.run();
    }
}