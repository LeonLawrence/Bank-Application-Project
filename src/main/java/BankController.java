public class BankController {

    private BankView theView;
    private BankModel theModel;

    public BankController(BankView theView, BankModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
    }

    public int displayResult() {
        int balance = theModel.getBalance();
        theView.displayResult(balance);
        return balance;
    }

    public void executeDeposit(int amount) {
        theModel.deposit(amount);
        theView.displayResult(theModel.getBalance());
    }

    public void executeWithdraw(int amount) {
        if (theModel.getBalance() < amount){
            System.out.println("NOT ENOUGH FUNDS, YOUR CURRENT ACCOUNT BALANCE IS: £" + displayResult());
        } else if (theModel.getBalance() > 0){
            System.out.println("WITHDRAW SUCCESSFUL");
            theModel.withdraw(amount);
            theView.displayResult(theModel.getBalance());
        }
    }
}


