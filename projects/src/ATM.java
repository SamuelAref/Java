import java.util.Scanner;

public class ATM {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // Welcome
        // Enter your 4-digit Pin
        // 1.Balance Enquiry 2. Withdrawal
        // Your Balance is -----.-- ETB 1. Continue 2. Exit 1. 100 2. 200 3.300 4.500
        // 5.1000 6.2000 7.4000 8.other amount 9.Exit

        // Object Creation
        ATMStorage user1 = new ATMStorage("Samuel Arefeaynie", 1234, 5000);

        // Greeting
        System.out.println("Welcome");

        int PassWordTryCounter = 3;
        int BIorWD = 0;
        int WD = 0;
        int CustomAmount = 0;

        while (PassWordTryCounter > 0) {

            // Password Entry
            System.out.println("Enter your 4-digit Pin : ");
            int userPin = userInput.nextInt();
            int userPassword = user1.getPassword();

            // Password Check
            if (passwordCheck(userPin, userPassword)) {

                System.out.println(WelcomeName(user1.getName()));
                System.out.println("1.Balance Enquiry     2. Withdrawal");
                BIorWD = userInput.nextInt();

                while (BIorWD == 1) {

                    System.out.println("Your Balance is: " + checkBalance(user1.getBalance()));
                    System.out.println("1. Refresh Balance 2. Withdrawal 3.Exit");
                    BIorWD = userInput.nextInt();

                }
                while (BIorWD == 2) {

                    System.out.println(" 1. 100 2. 200 3.300 4.500 5.1000 6.2000 7.4000 8.other amount 9.Exit");
                    WD = userInput.nextInt();

                    if (WD == 1) {

                        if (100 >= user1.getBalance()) {
                            System.out.println("You dont have that amount: ");
                            BIorWD = 1;
                        } else {
                            user1.setBalance(withdrawal(user1.getBalance(), 100));
                            BIorWD = 1;

                        }

                    } else if (WD == 2) {

                        if (200 >= user1.getBalance()) {
                            System.out.println("You dont have that amount: ");
                            BIorWD = 1;
                        } else {
                            user1.setBalance(withdrawal(user1.getBalance(), 200));
                            BIorWD = 1;

                        }

                    } else if (WD == 3) {

                        if (300 >= user1.getBalance()) {
                            System.out.println("You dont have that amount: ");
                            BIorWD = 1;
                        } else {
                            user1.setBalance(withdrawal(user1.getBalance(), 300));
                            BIorWD = 1;

                        }

                    } else if (WD == 4) {

                        if (500 >= user1.getBalance()) {
                            System.out.println("You dont have that amount: ");
                            BIorWD = 1;
                        } else {
                            user1.setBalance(withdrawal(user1.getBalance(), 500));
                            BIorWD = 1;

                        }

                    } else if (WD == 5) {

                        if (1000 >= user1.getBalance()) {
                            System.out.println("You dont have that amount: ");
                            BIorWD = 1;
                        } else {
                            user1.setBalance(withdrawal(user1.getBalance(), 1000));
                            BIorWD = 1;

                        }
                    } else if (WD == 6) {

                        if (2000 >= user1.getBalance()) {
                            System.out.println("You dont have that amount: ");
                            BIorWD = 1;
                        } else {
                            user1.setBalance(withdrawal(user1.getBalance(), 2000));
                            BIorWD = 1;

                        }
                    } else if (WD == 7) {

                        if (4000 >= user1.getBalance()) {
                            System.out.println("You dont have that amount: ");
                            BIorWD = 1;
                        } else {
                            user1.setBalance(withdrawal(user1.getBalance(), 4000));
                            BIorWD = 1;

                        }

                    } else if (WD == 8) { // custom amount

                        System.out.println("Enter your custom amount: ");
                        CustomAmount = userInput.nextInt();

                        if (CustomAmount > user1.getBalance()) {
                            System.out.println("You Don't have that amount");
                            BIorWD = 1;
                        } else {
                            user1.setBalance(withdrawal(user1.getBalance(), CustomAmount));
                            BIorWD = 1;
                        }

                    } else if (WD == 9) {

                        BIorWD = 3;

                    }

                }

                while (BIorWD != 1 && BIorWD != 2 && PassWordTryCounter != exitt()) {
                    PassWordTryCounter = exitt();
                }

            }

            else {

                PassWordTryCounter--;

                if (PassWordTryCounter == 0) {
                    PassWordTryCounter = exitt();
                } else {
                    System.out.println("you have " + PassWordTryCounter + " chance left try again: ");
                }

            }

        }
        System.out.println("Exiting, Please Take Your Card!!");

    }

    // Functions

    // Check Password
    static boolean passwordCheck(int userPin, int userPassword) {

        if (userPin == userPassword) {
            return true;
        } else {
            return false;
        }
    }

    // Greeting with Name
    static String WelcomeName(String Name) {

        return "Welcome " + Name;

    }

    // Withdraw
    static int withdrawal(int balance, int amount) {

        return balance - amount;

    }

    // Check Balance
    static int checkBalance(int balance) {

        return balance;
    }

    // Exit Program
    static int exitt() {

        return -1;
    }

}
