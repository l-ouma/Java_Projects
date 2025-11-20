import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //ROCK PAPER SCISSOR GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // GET CHOICE FROM USER
        System.out.println("***********************************");
        System.out.println("Welcome to Rock Paper Scissor Game!");
        System.out.println("***********************************");

        String[] choices = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock")
                    && !playerChoice.equals("paper")
                    && !playerChoice.equals("scissors")){
                System.out.println("You entered an invalid move.");
                continue;
            }

            // GET RANDOM CHOICE FOR THE COMPUTER
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // CHECK WIN CONDITION
            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if(playerChoice.equals("rock") && computerChoice.equals("scissors")){
                System.out.println("You win!");
            }
            else if(playerChoice.equals("paper") && computerChoice.equals("rock")){
                System.out.println("You win!");
            }
            else if(playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }

            // ASK TO PLAY AGAIN
            System.out.print("Play again? yes/no: ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        // GOODBYE MESSAGE
        System.out.println("Thanks for playing!");

        scanner.nextLine();

    }
}