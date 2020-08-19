public class UserMenu {
    public void menu() {
        do {
            System.out.println("Enter an option");
            option = scan.next().charAt(0);

            switch (option) {
                case 'A':
                    System.out.println("Balance:" + balance);
                    break;

                case 'B':
                    System.out.println("Enter Amount to Deposit");
                    int amount = scan.nextInt();
                    deposit(amount);
                    break;

                case 'C':
                    System.out.println("Enter Amount to Withdraw");
                    int amount2 = scan.nextInt();
                    withdraw(amount2);
                    break;

                case 'E':
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid Option, Please enter again");
                    break;
            }
        } while (option != 'E');
        System.out.println("Application Terminated");
    }
}

