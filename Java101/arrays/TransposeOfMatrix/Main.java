import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = in.nextInt();
        int[][] arr = new int[row][column];
        int[][] transpoze = new int[column][row];

        System.out.println("Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println("Transpoze: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transpoze[i][j] = arr[j][i];
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }
    }
}

