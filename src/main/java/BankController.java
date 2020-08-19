public class BankController {

    private BankView theView;
    private BankModel theModel;
    private int amount = 0;

    public BankController(BankView theView, BankModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
    }

    public void executeDeposit() {
        theModel.deposit(amount);
        theView.result(theModel.getBalance());
    }

    public void executeWithdraw() {
        theModel.withdraw(amount);
        theView.result(theModel.getBalance());
    }


//    theModel.addTwoNumbers(firstNumber, secondNumber);
//                theView.setResultsTextField(theModel.getCalculationValue());
}

