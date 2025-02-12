import java.util.Random;
import java.util.Scanner;

public class Main {
    static int updateRights(int right, int number) {
        right--;
        if (right == 0) {
            System.out.println("No more guesses left. You lost!");
            System.out.println("The secret number was: " + number);
        } else {
            System.out.println("Remaining guesses: " + right);
        }
        return right;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int right = 5;
        System.out.println("You have 5 guesses!");

        while (right > 0) {
            System.out.print("Please enter your guess: ");
            int selected = in.nextInt();

           if (selected < 0 || selected > 100) {
               System.out.println("Please enter a number between 0 and 100!");
               right = updateRights(right, number);
               if (right == 0)
                   break;
               continue;
           }

           if (selected == number) {
               System.out.println("Congratulations, you won!");
               System.out.println("The secret number was: " + number);
               break;
           } else {
               if (selected > number)
                   System.out.println(selected + " is greater than the secret number!");
               else
                   System.out.println(selected + " is less than the secret number!");

               right = updateRights(right, number);
               if (right == 0)
                   break;
           }
        }
    }
}

