import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    String[][] gameBoard;
    String[][] mineBoard;
    boolean isWin = false;
    int counter;
    int mineAmount;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        gameBoard = new String[rowNumber][colNumber];
        mineBoard = new String[rowNumber][colNumber];
    }

    public void run() {
        initBoard();
        placeMines();
        printBoard(gameBoard);

        Scanner in = new Scanner(System.in);

        while (!isWin) {
            System.out.print("Enter row: ");
            int row = in.nextInt();
            System.out.print("Enter column: ");
            int col = in.nextInt();
            System.out.print("====================\n");

            if (row < 0 || row >= rowNumber || col < 0 || col >= colNumber)
                System.out.println("The selected cell is out of bounds! Please choose a valid cell.");
            else if (!(gameBoard[row][col].equals("* ") || gameBoard[row][col].equals("- ")))
                System.out.println("This cell has already been selected, please choose another one.");
            else
                checkPoint(row,col);
        }
    }

    private void initBoard() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                gameBoard[i][j] = "- ";
                mineBoard[i][j] = "- ";
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int totalMines = (rowNumber * colNumber) / 4;
        int i = 0;
        while (i < totalMines) {
            int randRow = rand.nextInt(rowNumber);
            int randCol = rand.nextInt(colNumber);

            if (!mineBoard[randRow][randCol].equals("* ")) {
                mineBoard[randRow][randCol] = "* ";
                mineAmount++;
                i++;
            }
        }
    }

    private void checkPoint(int row, int col) {
        if (mineBoard[row][col].equals("* ")) {
            isWin = true;
            System.out.println("YOU LOST THE GAME!");
            printBoard(mineBoard);
            return;
        }
        checkNeighbours(row,col);
        counter++;

        checkWinCondition();
    }

    private void checkNeighbours(int row, int col) {
        int rowLower = Math.max(0, row - 1);
        int rowUpper = Math.min(rowNumber - 1, row + 1);
        int colLower = Math.max(0, col - 1);
        int colUpper = Math.min(colNumber - 1, col + 1);
        int mineCount = 0;

        for (int i = rowLower; i <= rowUpper; i++) {
            for (int j = colLower; j <= colUpper; j++) {
                if (mineBoard[i][j].equals("* "))
                    mineCount++;
            }
        }
        gameBoard[row][col] = mineCount + " ";
        printBoard(gameBoard);
    }

    private void checkWinCondition() {
        if (counter == (rowNumber * colNumber) - mineAmount) {
            isWin = true;
            System.out.println("CONGRATULATIONS, YOU WON!");
            printBoard(mineBoard);
        }
    }

    private void printBoard(String[][] arr) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
