import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Username: ");
        String username = in.nextLine();

        System.out.print("Password: ");
        String password = in.nextLine();

        if (username.equals("Java") && password.equals("java123"))
            System.out.println("Login successful");
        else {
            System.out.print("Incorrect password!!\nPress 1 to reset your password or 2 to exit: ");
            int choice = in.nextInt();

            if (choice == 1) {
                in.nextLine();
                System.out.print("Enter your new password: ");
                String newPassword = in.nextLine();
                if (newPassword.equals("java123"))
                    System.out.println("Your new password cannot be same as the old one!");
                else
                    System.out.println("Password successfully updated.");
            }
            else
                System.out.println("Exiting...");
        }
    }
}
