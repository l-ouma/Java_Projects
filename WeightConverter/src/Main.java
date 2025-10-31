import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // I am going to create a weight conversion program
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double weight;
        double newWeight;
        int choice;
        // Welcome message
        System.out.println("Weight conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        // prompt for user choice
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        // option1 convert lbs to kgs
        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("the new weight in kgs is: %.2f ", newWeight);
        }
        // option2 convert kgs to lbs
        if (choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("the new weight in lbs is: %.2f ", newWeight);
        }
        // else print not a valid option.
        else{
            System.out.print("That was not a valid choice.");
        }
        scanner.close();
    }
}