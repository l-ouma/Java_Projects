import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JAVA SLOT MACHINE PROGRAM

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // Display welcome msg
        System.out.println("****************************");
        System.out.println("Welcome to Java Slots. ");
        System.out.println("Symbols: 🍒, 🍉, 🍋, 🛎️, ⭐️");
        System.out.println("*****************************");

        // Play if balance is > 0
        while (balance > 0) {
            System.out.println("Current balance: $" + balance );
            // enter bet amount
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //    Verify if bet > balance
            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            //    Verify if bet is > 0
            else if (bet <= 0) {
                System.out.println("Bet must be greater than zero");
                continue;
            }
            //    Subtract bet from balance
            else{
                balance -= bet;
            }
            //  Spin Row
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance = balance + payout;
            }
            else{
                System.out.println("Sorry you lost this round");
            }

            // Ask user to play again
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }

        }

        // Exit Message
        System.out.println("GAME OVER! Your final balance is $" + balance);

        scanner.close();
    }
    static String[] spinRow() {

        String[] Symbols = {"🍒", " 🍉", "🍋", "🛎️", "⭐️"};
        String[] row = new String[3];
        Random random = new Random();


        for (int i = 0; i < 3; i++) {
            row[i] = Symbols[random.nextInt(Symbols.length)];
        }

        return row;
    }

    // Print row
    static void printRow(String[] row) {
        System.out.println("***************************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***************************");
    }

    //Get Payout
    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🛎️" -> bet * 10;
                case "⭐️" -> bet * 20;
                default -> 0;
            };
        }
        else if (row[0].equals(row[1])) {
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🛎️" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }
        else if (row[1].equals(row[2])){
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🛎️" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }


        return 0;
    }

}