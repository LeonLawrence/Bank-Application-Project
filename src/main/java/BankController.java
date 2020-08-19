public class BankController {

    private BankView theView;
    private BankModel theModel;
    private int amount;

    public BankController(BankView theView, BankModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
    }

    public void displayResult() {
        theView.displayResult(theModel.getBalance());
    }

    public void executeDeposit(int amount) {
        theModel.deposit(this.amount);
        theView.displayResult(theModel.getBalance());
    }

    public void executeWithdraw(int amount) {
        theModel.withdraw(amount);
        theView.displayResult(theModel.getBalance());
    }

    public void process() {
        theView.menu();
    }
}

