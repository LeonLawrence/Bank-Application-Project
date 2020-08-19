import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankController bankController = new BankController(new BankView(), new BankModel());

        process(bankController);
    }

    public static void process(BankController bs) {

        int option;
        Scanner scan = new Scanner(System.in);

        System.out.println("1 check Balance");
        System.out.println("2 Deposit");
        System.out.println("3 Withdraw");
        System.out.println("4 Exit");

        do {
            System.out.println("Enter an option");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Balance: " );
                    bs.displayResult();
                    break;

                case 2:
                    System.out.println("Enter Amount to Deposit");
                    int amount = scan.nextInt();
                    bs.executeDeposit(amount);
                    break;

                case 3:
                    System.out.println("Enter Amount to Withdraw");
                    int amount2 = scan.nextInt();
                    bs.executeWithdraw(amount2);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid Option, Please enter again");
                    break;
            }
        } while (option != 4);
        System.out.println("Application Terminated");
    }
}
