import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // JAVA BANKING PROGRAM project which will be usefull in
        // understanding how methods work.


        // step1 declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            // step2 display menu
            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            // step3 get and process user choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 ->balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        //EXIT MESSAGE
        System.out.println("**************************");
        System.out.println("Thank you have a nice day!");
        System.out.println("**************************");

        scanner.close();
    }
    // step4 showBalance() method
    static void showBalance(double balance) {
        System.out.println("****************");
        System.out.printf("$%.2f\n", balance);
    }

    // step5 deposit() method
    static double deposit() {

        double amount;

        System.out.print("Enter amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    // step6 withdraw() method
    static double withdraw(double balance){

        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient amount");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}