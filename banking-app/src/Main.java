import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int pin = 1234;
        int attempts = 0;
        int enteredPin;
        do {
            System.out.print("Enter your PIN: ");
            enteredPin = scanner.nextInt();
            if (pin != enteredPin) {
                System.out.println("Wrong PIN. Try again.");
            }
            attempts++;
            if (attempts >= 3) {
                System.out.println("You have reached 3 wrong attempts");
                System.exit(0);
            }

        } while (pin != enteredPin);
        System.out.println("Welcome!");

        int option;
        double balance = 1500;
        double amountDeposit;
        double amountWithdraw;



        while (true) {
            System.out.println("choose an option: ");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit Money");
            System.out.println("3 - Withdraw Money");
            System.out.println("4 - Exit");
            option = scanner.nextInt();
            if (option == 1) {
                System.out.println("Current balance: " + balance);
            } else {
                if (option == 2) {
                    System.out.print("Enter amount to deposit: ");
                    amountDeposit = scanner.nextDouble();
                    balance += amountDeposit;
                    System.out.print("Deposit successful.  ");
                    System.out.println("New balance: " + balance);

                } else {
                    if (option == 3) {
                        System.out.print("Enter amount to withdraw:");
                        amountWithdraw = scanner.nextDouble();
                        if (amountWithdraw > balance) {
                            System.out.println("Insufficient funds");
                        } else {
                            balance -= amountWithdraw;
                            System.out.println("New balance: " + balance);
                        }

                    } else {
                        if (option == 4) {
                            System.out.println("Goodbye");
                            break;

                        } else {
                            System.out.println("Wrong option Try again ...");

                        }
                    }
                }
            }


        }
        scanner.close();
    }
}
