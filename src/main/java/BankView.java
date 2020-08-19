import java.util.Scanner;

public class BankView {
    private BankController bs;

    public void menu() {

        char option;
        Scanner scan = new Scanner(System.in);

        System.out.println("A check Balance");
        System.out.println("B Deposit");
        System.out.println("C Withdraw");
        System.out.println("D Exit");

        do {
            System.out.println("Enter an option");
            option = scan.next().charAt(0);

            switch (option) {
                case 'A':
                    System.out.println("Balance: " );
                    bs.displayResult();
                    break;

                case 'B':
                    System.out.println("Enter Amount to Deposit");
                    int amount = scan.nextInt();
                    bs.executeDeposit(amount);
                    break;

                case 'C':
                    System.out.println("Enter Amount to Withdraw");
                    int amount2 = scan.nextInt();
                    bs.executeWithdraw(amount2);
                    break;

                case 'D':
                    break;

                default:
                    System.out.println("Invalid Option, Please enter again");
                    break;
            }
        } while (option != 'D');
        System.out.println("Application Terminated");
    }

        public void displayResult(int result) {
            System.out.println("Your Answer: " + result);
        }
    }


