import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // QUIZ GAME
        Scanner scanner = new Scanner(System.in);

        // Question array[]
        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain",
                              "What year was Facebook launched?",
                              "Who is known as the father of Computers?",
                              "What was the first programing language?"};

        // Options array[][]
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. managing passwords"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. assembly"}};

        // Declare Variables
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        // Welcome message
        System.out.println("*****************************");
        System.out.println("Welcome to the Java quiz game");
        System.out.println("*****************************");

        // Question (loop)
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            //     Options
            for(String option : options[i]){
                System.out.println(option);
            }
            //     Get our guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            //     Check our guess
            if(guess == answers[i]){
                System.out.println("*******");
                System.out.println("CORRECT!");
                System.out.println("*******");
                score++;
            }
            else{
                System.out.println("******");
                System.out.println("WRONG!");
                System.out.println("******");
            }
        }
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        scanner.close();
    }
}