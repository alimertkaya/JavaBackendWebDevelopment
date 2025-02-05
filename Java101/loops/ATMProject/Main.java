import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userName, password;
        int loginAttempts = 3;
        int balance = 2000;
        int operation;

        while (loginAttempts > 0) {
            System.out.print("Enter your username: ");
            userName = in.nextLine();
            System.out.print("Enter your password: ");
            password = in.nextLine();

            if (userName.equals("Patika") && password.equals("p123")) {
                System.out.println("Welcome to X Bank!");
                do {
                    System.out.println("1- Deposit Money\n" +
                            "2- Withdraw Money\n" +
                            "3- Check Balance\n" +
                            "4- Exit\n");
                    System.out.print("Please select the operation you want to perform: ");
                    operation = in.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.print("Enter the amount to deposit: ");
                            int amount = in.nextInt();
                            balance += amount;
                            System.out.println("Your new Balance: " + balance);
                            break;
                        case 2:
                            System.out.print("Enter the amount to withdraw: ");
                            amount = in.nextInt();
                            System.out.println(amount > balance ? "Insufficient balance." : (balance -= amount));
                            System.out.println("Your new Balance: " + balance);
                            break;
                        case 3:
                            System.out.println("Your current balance: " + balance);
                            break;
                        case 4:
                            System.out.println("Logging out...");
                            break;
                        default:
                            System.out.println("Invalid operation number!");
                    }
                } while (operation != 4);
                break;
            } else {
                loginAttempts--;
                System.out.println("Invalid username or password. Please try again.");
                System.out.println(loginAttempts == 0 ?
                        "Your account has been blocked! Please contact the bank." :
                        "Remaining login attempts: " + loginAttempts);
            }
        }

    }
}
