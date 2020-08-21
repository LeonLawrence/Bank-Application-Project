public class BankControllerGUI {
    private BankViewJFrame theViewGUI;
    private BankModel theModel;
    private int amount = 0;

    public BankControllerGUI(BankViewJFrame theViewGUI, BankModel theModel,BankListener bankListener) {
        this.theViewGUI = theViewGUI;
        this.theModel = theModel;

        this.theViewGUI.depositButtonListener(bankListener);
        this.theViewGUI.withdrawButtonListener(bankListener);
        this.theViewGUI.inputTextFieldListener(bankListener);
    }
}



