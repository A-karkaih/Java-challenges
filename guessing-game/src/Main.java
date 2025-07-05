import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        int attempts = 0;
        boolean isStillPlaying = true;

        while (isStillPlaying) {

            attempts = chooseDifficulty();
           /*
            if (attempts == 0) {
                isStillPlaying = false;
                break;
            }

            */
            playGame(attempts);
            isStillPlaying = askToPlayAgain();

        }

        System.out.println("See you Again :)");

    }

    static int chooseDifficulty() {
        int diff;

        while (true) {
            System.out.println("Choose difficulty:");
            System.out.println("1. Easy (10 tries)");
            System.out.println("2. Medium (6 tries)");
            System.out.println("3. Hard (3 tries)");
            System.out.print("Your choice: ");
            diff = scanner.nextInt();
//return exit the loop no return mean it keeps asking
            switch (diff) {
                case 1 -> {
                    return 10;
                }
                case 2 -> {
                    return 6;
                }
                case 3 -> {
                    return 3;
                }
                default -> System.out.println("Not a valid choice. Try again!");
            }
        }
    }


    static void playGame(int maxAttempts) {
        int randomNumber = random.nextInt(1, 101);
        int guess;
        int tries = 0;
        boolean correct = false;
        System.out.println("I'm thinking of a number between 1 and 100...");
        System.out.printf("You have %d attempts.\n", maxAttempts);
        System.out.println("the number is! " + randomNumber);
        do {
            guess = scanner.nextInt();
            tries++;
            if (guess > randomNumber) {
                System.out.println("Too high!");
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess == randomNumber) {
                System.out.printf("Congratulations! You guessed the number in %d tries.", tries);
                correct = true;
                break;
            }

        } while (tries < maxAttempts);
        if (!correct) {

            System.out.println("Sorry! You've run out of attempts. The number was ." + randomNumber);

        }

    }

    static boolean askToPlayAgain() {
        boolean stillPlaying;
        String answer = "";
        System.out.print("\n Do you want to play again? (yes/no): \n");
        scanner.nextLine();
        answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            stillPlaying = true;
            return stillPlaying;
        } else if (answer.equalsIgnoreCase("no")) {
            stillPlaying = false;
            return stillPlaying;
        } else {
            System.out.println("incorrect choice");
            stillPlaying = true;
            return stillPlaying;
        }

    }
}
