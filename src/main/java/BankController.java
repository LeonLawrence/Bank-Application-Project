public class BankController {

    private BankView theView;
    private BankModel theModel;

    public BankController(BankView theView, BankModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
    }

    public void execute() {
        int amount = 0;
        theModel.deposit(amount);
        theView.result(theModel.getBalance());
    }

//    theModel.addTwoNumbers(firstNumber, secondNumber);
//                theView.setResultsTextField(theModel.getCalculationValue());
}

