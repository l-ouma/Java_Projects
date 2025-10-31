import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // JAVA DICE ROLLER PROGRAM
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // step1 Declare variables
        int numOfDice;
        int total = 0;

        // step2 Get # of dce from the user
        System.out.println("Welcome to the Dice game");
        System.out.print("Enter the # of dice to role: ");
        numOfDice = scanner.nextInt();

        // step3 Check if # of dice > 0
        if(numOfDice > 0) {
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);

                // step4 Get the total
                total = total + roll;
            }
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("# of dice must be greater than 0");
        }

        scanner.close();
    }

    // Display ASCII of dice
    static void printDie(int roll){

        String dice1 = """
                 ------ 
                |       |
                |   ●   |
                |       |
                 ------  
                """;
        String dice2 = """
                 ------ 
                | ●     |
                |       |
                |     ● |
                 ------  
                """;
        String dice3 = """
                 ------ 
                | ●     |
                |   ●   |
                |     ● |
                 ------  
                """;
        String dice4 = """
                 ------ 
                | ●   ● |
                |       |
                | ●   ● |
                 ------  
                """;
        String dice5 = """
                 ------ 
                | ●   ● |
                |   ●   |
                | ●   ● |
                 ------  
                """;
        String dice6 = """
                 ------ 
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 ------  
                """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}